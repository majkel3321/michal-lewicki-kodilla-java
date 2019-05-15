package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {


        FilghtSearch search = new FilghtSearch();

        try {
            search.findFlight(new Flight("Moscow", "Paris"));

        } catch (RouteNotFoundException e) {

            System.out.println("Something went wrong! Error: " + e);
        }
    }
}
