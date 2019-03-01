package com.kodilla.spring.exercise;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    public int speedUp(int kmh){
        return kmh * 2;
    }


}
