package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FilghtSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean> airport = new HashMap<>();

        airport.put("Warsaw",true);
        airport.put("Berlin",true);
        airport.put("Moscow",true);
        airport.put("Paris",true);

        if (airport.containsKey(flight.getArrivalAirport()) && airport.containsKey(flight.getDepartureAirport())){

            System.out.println("Route found!");
        }

        else {

            throw new RouteNotFoundException("Airport not found!");
        }

    }
}
