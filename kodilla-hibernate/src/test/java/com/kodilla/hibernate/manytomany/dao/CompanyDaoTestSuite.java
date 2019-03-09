package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Test
    public void testSaveManyToMany(){

        Employee walterWhite = new Employee("Walter","White");
        Employee stephanieClarkson = new Employee("Stephanie","Clarkson");
        Employee lindaKovalsky = new Employee("Linda","Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(walterWhite);
        dataMasters.getEmployees().add(stephanieClarkson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(walterWhite);
        greyMatter.getEmployees().add(lindaKovalsky);

        walterWhite.getCompanies().add(softwareMachine);
        walterWhite.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();


        Assert.assertNotEquals(0,softwareMachineId);
        Assert.assertNotEquals(0,dataMastersId);
        Assert.assertNotEquals(0,greyMatterId);



    }


}
