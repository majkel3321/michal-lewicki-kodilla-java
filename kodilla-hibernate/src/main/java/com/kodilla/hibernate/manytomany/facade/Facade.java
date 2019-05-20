package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> getCompaniesWithLetters(String name) throws QueriesProcessingException {

        if ("".equals(name)) {
            LOGGER.error(QueriesProcessingException.ERR_NAME_NULL);
            throw new QueriesProcessingException(QueriesProcessingException.ERR_NAME_NULL);
        }
        List<Company> companies = companyDao.retrieveCompaniesContainingLetters(name);

        if (companies.size() == 0) {
            LOGGER.error(QueriesProcessingException.ERR_NOT_FOUND);
            throw new QueriesProcessingException(QueriesProcessingException.ERR_NOT_FOUND);
        }

        return companies;
    }

    public List<Employee> getEmpoyeesContainingLetters(String letters) throws QueriesProcessingException{

        if ("".equals(letters)){
            LOGGER.error(QueriesProcessingException.ERR_NAME_NULL);
            throw new QueriesProcessingException(QueriesProcessingException.ERR_NAME_NULL);
        }

        List<Employee> employees = employeeDao.retrieveEmployeesLastnameContainingLetters(letters);

        if (employees.size() == 0){
            LOGGER.error(QueriesProcessingException.ERR_NOT_FOUND);
            throw new QueriesProcessingException(QueriesProcessingException.ERR_NOT_FOUND);
        }

        return employees;
    }




}
