package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

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


    public void searchTo(String city){

        flightList.stream()
                .filter(flight -> flight.getTo().equals(city))
                .forEach(System.out::println);
    }

    public void searchFromTo(String from, String to){

        String start2 = "";


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

                if(loop.equals(loop1)){
                     start2 = loop;
                }
            }
        }

        String finalStart = start2;
        flightList.stream().filter(flight -> flight.getFrom().equals(from))
                .filter(flight -> flight.getTo().equals(finalStart))
                .forEach(System.out::println);

        String finalStart1 = start2;
        flightList.stream()
                .filter(flight -> flight.getFrom().equals(finalStart1))
                .filter(flight -> flight.getTo().equals(to))
                .forEach(System.out::println);














    }
}
