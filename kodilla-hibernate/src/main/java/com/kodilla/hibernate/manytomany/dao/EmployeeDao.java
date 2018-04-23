package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> workersWithLastName(@Param("LASTNAME") String lastname);

    @Query(nativeQuery = true)
    List<Employee> employeeLastnameLikeAny(@Param("LETTERS") String letters);

    @Query(nativeQuery = true)
    List<Employee> employeeFirstnameLikeAny(@Param("LETTERS") String letters);
}
