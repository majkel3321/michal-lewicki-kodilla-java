package com.kodilla.spring.exercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean("diesel")
    public Engine getEngine() {
        return new DieselEngine();
    }
}
