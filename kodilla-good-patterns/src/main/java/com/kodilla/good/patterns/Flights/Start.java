package com.kodilla.good.patterns.Flights;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the option: ");
        System.out.println("1 - find flights from.");
        System.out.println("2 - find flights to.");
        System.out.println("3 - find flight from ... to ...");
        int option = input.nextInt();
        input.nextLine();

        String city;
        String cityTo;
        if(option == 1) {
            System.out.println("Enter the city: ");
            city = input.nextLine();
            FlightSearchEngine.findFrom(city);
        } else if(option == 2) {
            System.out.println("Enter the city: ");
            city = input.nextLine();
            FlightSearchEngine.findTo(city);
        } else if(option == 3) {
            System.out.println("Enter departure city: ");
            city = input.nextLine();
            System.out.println("Enter arrival city: ");
            cityTo = input.nextLine();
            boolean isExist = FlightSearchEngine.findFlight(city, cityTo);
            if (!isExist) {
                System.out.println("We did not find any direct flights!");
                FlightSearchEngine.withChange(city, cityTo);
            }
        }




    }
}
