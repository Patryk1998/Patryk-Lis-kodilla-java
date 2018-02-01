package com.kodilla.good.patterns.Food2Door;


public class OrderingProcess {
    public static void main(String[] args) {

        Supplier supplier = new ExtraFoodShop();
        supplier.getInformation();
        Order order = OrderCreator.createOrder();
        boolean isOrdered = supplier.process(order);
        if(isOrdered) {
            System.out.println("Thanks for order!");
            System.exit(11);
        } else System.out.println("Smothing went wrong!");

    }



}
