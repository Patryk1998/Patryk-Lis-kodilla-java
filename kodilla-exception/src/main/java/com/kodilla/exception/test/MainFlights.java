package com.kodilla.exception.test;

public class MainFlights {
    public static void main(String[] args){
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try{
            flightSearchEngine.findFlight(new Flight("Rzeszow", "Poznan"));
        } catch (RouteNotFoundException e) {
            System.out.println("Your flight was not found!");
        } finally {
            System.out.println("Thank you for choosing our website!");
        }
    }
}
