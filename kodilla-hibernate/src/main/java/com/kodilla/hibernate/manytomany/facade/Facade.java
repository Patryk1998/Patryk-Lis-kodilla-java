package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import  org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Component
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public Integer findLike(String letters) throws FacadeExceptions {
        Integer returnValue = 0;

        try {
            LOGGER.info("Retrieving information about employees...");
            LOGGER.info("Searching for similar firstnames");
            List<Employee> employeesFirstname = employeeDao.employeeFirstnameLikeAny(letters);
            LOGGER.info("Searching for similar lastnames");
            List<Employee> employeesLastname = employeeDao.employeeLastnameLikeAny(letters);

            LOGGER.info("Creating common list...");
            List<Employee> employees = new ArrayList<>();

            boolean ifAdded1 = employees.addAll(employeesFirstname);
            boolean ifAdded2 = employees.addAll(employeesLastname);

            if (!ifAdded1 && !ifAdded2) {
                LOGGER.error(FacadeExceptions.ADD_TO_LIST_EMPLOYEE);
                throw new FacadeExceptions(FacadeExceptions.ADD_TO_LIST_EMPLOYEE);
            }

            LOGGER.info("Retrieving information about companies...");
            List<Company> companies = companyDao.companyNameLikeAny(letters);

            LOGGER.info("Displaying inforamtions...");

            employees.stream()
                    .forEach(employee -> System.out.println("Name: " + employee.getFirstname() + "\n" +
                            "Surname: " + employee.getLastname() + "\n"));
            companies.stream()
                    .forEach(company -> System.out.println("Company name:" + company.getName() + "\n"));

            returnValue = companies.size() + employees.size();
        } finally {
            System.out.println("Process finished");
        }

        return returnValue;

    }

}
