package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class HealthyShop implements Supplier {

    SupplierInfo supplierInfo = new SupplierInfo("HealthyShop", ListOfProducts.createListFor2Company());

    public void process(Order order) {
        for(Map.Entry<String, Integer> test: supplierInfo.getListOfProducts().entrySet()) {
            if(test.getKey().contains(order.getNameOfProduct())) {
                if(test.getValue() >= order.getQuantityToOrder()) {
                    System.out.println("You ordered: " + order.getQuantityToOrder() + " of: " + order.getNameOfProduct());
                } else {
                    System.out.println("We have not enought " + order.getNameOfProduct());
                }
            }
        }
    }

    public void getInformation() {
        System.out.println("Name of company: " + supplierInfo.getNameOfCompany());
        System.out.println("List of products and quantity: ");
        for(Map.Entry<String, Integer> example: supplierInfo.getListOfProducts().entrySet()) {
            System.out.println("Name: " + example.getKey() + ", Quantity: " + example.getValue());
        }
    }
}
