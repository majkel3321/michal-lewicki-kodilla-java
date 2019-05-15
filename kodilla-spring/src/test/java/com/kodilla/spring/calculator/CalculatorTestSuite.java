package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        double sum = calculator.add(2.1, 17.3);
        double sub = calculator.sub(10.5, 3.4);
        double mul = calculator.mul(5, 9.5);
        double div = calculator.div(42, 4);

        Assert.assertEquals(19.4, sum, 0.001);
        Assert.assertEquals(7.1, sub, 0.001);
        Assert.assertEquals(47.5, mul, 0.001);
        Assert.assertEquals(10.5, div, 0.001);


    }
}
