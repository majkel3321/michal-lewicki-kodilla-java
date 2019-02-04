package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;
        String city1;


        Flight flight1 = new Flight("Krakow","Moscow");
        Flight flight2 = new Flight("Krakow","Rome");
        Flight flight3 = new Flight("Moscow","Berlin");
        Flight flight4 = new Flight("Moscow","Madrid");
        Flight flight5 = new Flight("Madrid","Rome");

        List<Flight> flightsList = new ArrayList();

        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);
        flightsList.add(flight5);


        FlightSearch flightSearch = new FlightSearch(flightsList);



        System.out.println("Search flights\n1.From\n2.To\n3.From [  ] to [  ]");
        int choice = scanner.nextInt();


        switch (choice){
            case 1:
                System.out.println("Search flights from: ");
                city = scanner.next();
                flightSearch.searchFrom(city);
            break;

            case 2:
                System.out.println("Search flights to: ");
                city = scanner.next();
                flightSearch.searchTo(city);
            break;

            case 3:
                System.out.println("Search flights from: ");
                city = scanner.next();

                System.out.println("Search flights to: ");
                city1 = scanner.next();
                flightSearch.searchFromTo(city,city1);
            break;

            default:
                System.out.println("Wrong number!");

        }






    }
}
