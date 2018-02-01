package com.kodilla.good.patterns.Food2Door;

import java.util.Map;
import java.util.stream.Collectors;

public class ExtraFoodShop implements Supplier {

    SupplierInfo supplierInfo = new SupplierInfo("ExtraFoodShop", ListOfProducts.createListFor1Company());

    public boolean process(Order order) {
//        for(Map.Entry<String, Integer> test: supplierInfo.getListOfProducts().entrySet()) {
//            if(test.getKey().contains(order.getNameOfProduct())) {
//
//            }
//        }
        System.out.println("You ordered: " + order.getQuantityToOrder() + " of: " + order.getNameOfProduct());
        return true;
    }

    public void getInformation() {
        System.out.println("Name of company: " + supplierInfo.getNameOfCompany());
        System.out.println("List of products and quantity: ");
        for(Map.Entry<String, Integer> example: supplierInfo.getListOfProducts().entrySet()) {
            System.out.println("Name: " + example.getKey() + ", Quantity: " + example.getValue());
        }
    }
}
