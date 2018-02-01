package com.kodilla.good.patterns.Food2Door;

import java.util.Scanner;

public class OrderCreator {

    public static Order createOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the product: ");
        String nameOfProduct = input.nextLine();
        System.out.println("Enter quantity of " + nameOfProduct + " :");
        int quantityToOrder = input.nextInt();
        return new Order(nameOfProduct, quantityToOrder);
    }
}
