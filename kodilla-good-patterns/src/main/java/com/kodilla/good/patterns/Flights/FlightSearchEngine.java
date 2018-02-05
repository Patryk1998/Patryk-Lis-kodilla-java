package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    public static void findFrom(String city) {
        System.out.println("Flight from: " + city);
        Flight.dataBase.stream()
                .filter(set -> set.getFrom().contains(city))
                .forEach(set -> System.out.println(set.getFrom() + " -> " + set.getTo()));

    }

    public static void findTo(String city) {
        System.out.println("Flight to: " + city);
        Flight.dataBase.stream()
                .filter(set -> set.getTo().contains(city))
                .forEach(set -> System.out.println(set.getFrom() + " -> " + set.getTo()));
    }

    public static void withChange(String from, String to) {
        Set<Flight> flightsFrom = Flight.dataBase.stream()
                .filter(set -> set.getFrom().contains(from))
                .collect(Collectors.toSet());
        Set<Flight> flightsTo = Flight.dataBase.stream()
                .filter(set -> set.getTo().contains(to))
                .collect(Collectors.toSet());

        for(Flight entry: flightsFrom)
        flightsTo.stream()
                .filter(set -> set.getFrom().contains(entry.getTo()))
                .forEach(set -> System.out.println(entry.getFrom() + " -> " + entry.getTo() + " -> " + set.getTo()));
        }


    public static boolean findFlight(String from, String to) {
       boolean flightExist = Flight.dataBase.stream()
                .anyMatch(set -> set.getFrom().contains(from) && set.getTo().contains(to));

       if(flightExist)
       {
           System.out.println("Flight from " + from + " to " + to + " founded!");
       }

       return flightExist;

    }
}
