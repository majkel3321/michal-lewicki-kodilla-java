package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;


        Flight flight1 = new Flight("Krakow","Warsaw","Gdansk");
        Flight flight2 = new Flight("Moscow","Warsaw","Berlin");
        Flight flight3 = new Flight("Rome","Berlin","Oslo");
        Flight flight4 = new Flight("Krakow","Munich","Madrid");
        Flight flight5 = new Flight("Moscow","Berlin","Madrid");

        List<Flight> flightsList = new ArrayList();

        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);
        flightsList.add(flight5);


        FlightSearch flightSearch = new FlightSearch(flightsList);

        System.out.println("Search flights\n1.From\n2.Through\n3.To");
        int choice = scanner.nextInt();


        switch (choice){
            case 1:
                System.out.println("Search flights from: ");
                city = scanner.next();
                flightSearch.searchFrom(city);
            break;

            case 2:
                System.out.println("Search flights through: ");
                city = scanner.next();
                flightSearch.searchTrough(city);
            break;

            case 3:
                System.out.println("Search flights to: ");
                city = scanner.next();
                flightSearch.searchTo(city);
            break;

            default:
                System.out.println("Wrong number!");

        }






    }
}
