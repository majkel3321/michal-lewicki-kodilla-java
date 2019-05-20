package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    Facade facade;

    private int company1Id;
    private int company2Id;
    private int company3Id;

    private int employee1Id;
    private int employee2Id;
    private int employee3Id;

    @Before
    public void createCompaniesAndEmployees() {
        Company company1 = new Company("Grey Matter");
        Company company2 = new Company("Data Masters");
        Company company3 = new Company("Software House");

        Employee employee1 = new Employee("Walter", "White");
        Employee employee2 = new Employee("Joe", "Black");
        Employee employee3 = new Employee("Pink", "Guy");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);

        companyDao.save(company1);
        company1Id = company1.getId();
        companyDao.save(company2);
        company2Id = company2.getId();
        companyDao.save(company3);
        company3Id = company3.getId();

        employeeDao.save(employee1);
        employee1Id = employee1.getId();
        employeeDao.save(employee2);
        employee2Id = employee2.getId();
        employeeDao.save(employee3);
        employee3Id = employee3.getId();
    }

    @After
    public void cleanUp() {
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            companyDao.deleteById(company3Id);
            employeeDao.deleteById(employee1Id);
            employeeDao.deleteById(employee2Id);
            employeeDao.deleteById(employee3Id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testGetCompaniesContainingLetters() {
        //Given
        //When
        List<Company> companies = new ArrayList<>();

        try {
            companies = facade.getCompaniesWithLetters("atte");
        } catch (QueriesProcessingException e) {
            System.out.println(e);
        }

        //Then
        assertEquals("Grey Matter", companies.get(0).getName());
        assertEquals(1, companies.size());
    }

    @Test
    public void testGetEmployeesContainingLetters() {
        //Given
        //When
        List<Employee> employees = new ArrayList<>();

        try {
            employees = facade.getEmpoyeesContainingLetters("ite");
        } catch (Exception e) {
            System.out.println(e);
        }

        //Then
        assertEquals("Walter", employees.get(0).getFirstname());
        assertEquals("White", employees.get(0).getLastname());
        assertEquals(1, employees.size());
    }
}