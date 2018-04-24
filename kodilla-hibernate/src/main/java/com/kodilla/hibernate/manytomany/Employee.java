package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.workersWithLastName",
        query = "FROM Employee WHERE Lastname = :LASTNAME"
)

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Employee.employeeLastnameLikeAny",
                query = "SELECT * FROM EMPLOYEES" +
                        " WHERE LASTNAME LIKE CONCAT ('%', :LETTERS, '%')",
                resultClass = Employee.class
        ),

        @NamedNativeQuery(
                name = "Employee.employeeFirstnameLikeAny",
                query = "SELECT * FROM EMPLOYEES" +
                        " WHERE FIRSTNAME LIKE CONCAT ('%', :LETTERS, '%')",
                resultClass = Employee.class
        )
})

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")

    public List<Company> getCompanies() {
        return companies;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
