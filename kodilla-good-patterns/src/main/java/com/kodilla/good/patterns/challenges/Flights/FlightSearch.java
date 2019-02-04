package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private List<Flight> flightList;
    private String start2;

    public FlightSearch(List<Flight> flightList){
        this.flightList = flightList;
    }

    public void searchFrom(String city){

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(city))
                .forEach(System.out::println);
    }


    public void searchTo(String city){

        flightList.stream()
                .filter(flight -> flight.getTo().equals(city))
                .forEach(System.out::println);
    }

    public void searchFromTo(String from, String to){


       List<String> flyTo = flightList.stream()
               .filter(flight -> flight.getFrom().equals(from))
               .map(flight -> flight.getTo())
               .collect(Collectors.toList());

       List<String> flyFrom = flightList.stream()
               .filter(flight -> flight.getTo().equals(to))
               .map(flight -> flight.getFrom())
               .collect(Collectors.toList());


        for (String loop : flyTo){

            for (String loop1 : flyFrom){

                if(loop == loop1){
                    start2 = loop;
                }
            }
        }

        flightList.stream().filter(flight -> flight.getFrom().equals(from))
                .filter(flight -> flight.getTo().equals(start2))
                .forEach(System.out::println);

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(start2))
                .filter(flight -> flight.getTo().equals(to))
                .forEach(System.out::println);













    }
}
