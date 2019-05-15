package com.kodilla.spring.Exercise;

import com.kodilla.spring.exercise.Car;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarTestSuite {

    @Test
    public void testSpeed() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);

        int speed = car.drive(20);
        car.drive(25);
        car.drive(30);


        Assert.assertEquals(225, car.drive(0));


    }
}
