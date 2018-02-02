package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Connection {

    List<String> connection = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public  void  createList() {
        int counter = 0;
        while(input.nextLine() == "x" && counter >=2) {
            System.out.println("Enter city: ");
            String city = input.nextLine();
            connection.add(city);
            System.out.println("Press 'x' if you want save a list");
        }
    }


}
