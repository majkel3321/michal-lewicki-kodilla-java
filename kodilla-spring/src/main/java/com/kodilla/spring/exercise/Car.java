package com.kodilla.spring.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("diesel")
    Engine engine;


    private int speed = 0;

    public int drive(int kmh) {
        return speed += engine.speedUp(kmh);
    }

}
