package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private List<Flight> flightList;


    public FlightSearch(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public void searchFrom(String city) {

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(city))
                .forEach(System.out::println);
    }


    public void searchTo(String city) {

        flightList.stream()
                .filter(flight -> flight.getTo().equals(city))
                .forEach(System.out::println);
    }

    public void searchFromTo(String from, String to) {


        List<Flight> startA = flightList.stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());

        List<Flight> endC = flightList.stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());

        for (Flight start : startA) {
            for (Flight end : endC) {
                if (start.getTo().equals(end.getFrom())) {
                    System.out.println(start);
                    System.out.println(end);
                }
            }
        }


    }
}














