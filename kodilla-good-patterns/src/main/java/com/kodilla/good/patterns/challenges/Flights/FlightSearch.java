package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightSearch {

    private List<Flight> flightList;

    public FlightSearch(List<Flight> flightList){
        this.flightList = flightList;
    }

    public void searchFrom(String city){

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(city))
                .forEach(System.out::println);
    }

    public void searchTrough(String city){

        flightList.stream()
                .filter(flight -> flight.getThrough().equals(city))
                .forEach(System.out::println);
    }

    public void searchTo(String city){

        flightList.stream()
                .filter(flight -> flight.getTo().equals(city))
                .forEach(System.out::println);
    }
}
