package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FilghtSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airport = new HashMap<>();

        airport.put("Warsaw", true);
        airport.put("Berlin", true);
        airport.put("Moscow", false);
        airport.put("Paris", true);

        if (airport.containsKey(flight.getArrivalAirport()) && airport.containsKey(flight.getDepartureAirport())) {

            if (airport.get(flight.getArrivalAirport()) != null && airport.get(flight.getDepartureAirport()) != null) {

                if (airport.get(flight.getArrivalAirport()).equals(true) && airport.get(flight.getDepartureAirport()).equals(true)) {
                    System.out.println("Route found");
                } else {
                    System.out.println("Airport closed!");
                }

            } else {
                System.out.println("Value was null!");
            }
        } else {

            throw new RouteNotFoundException("Airport not found!");
        }

    }
}
