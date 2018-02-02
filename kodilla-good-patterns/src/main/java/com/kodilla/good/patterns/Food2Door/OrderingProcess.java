package com.kodilla.good.patterns.Food2Door;


import java.util.HashMap;
import java.util.Map;

public class OrderingProcess {
    public static void main(String[] args) {


        Supplier supplier = new ExtraFoodShop();
        supplier.getInformation();
        Order order = OrderCreator.createOrder();
        supplier.process(order);



    }



}
