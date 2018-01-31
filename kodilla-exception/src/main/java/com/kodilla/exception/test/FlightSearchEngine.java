package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warszawa", true);
        flights.put("Krakow", false);
        flights.put("Berlin", true);
        flights.put("Praga", true);
        flights.put("Moskwa", false);
        flights.put("Poznan", true);
        String arrivalAirport = flight.getArrivalAirport();
        for(Map.Entry<String, Boolean> entry: flights.entrySet()){
            if(arrivalAirport.contains(entry.getKey())){
                if(entry.getValue() == true) {
                    System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + arrivalAirport + " exist!");
                    return;
                } else {
                    System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + arrivalAirport + " does not exist!");
                    return;
                }
                }
            }

        throw new RouteNotFoundException();




    }
}
