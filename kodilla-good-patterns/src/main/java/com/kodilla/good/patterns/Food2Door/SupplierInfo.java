package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class SupplierInfo {
    private String companyName;
    private Map<String, Integer> listOfProducts;

    public SupplierInfo(String nameOfCompany, Map<String, Integer> listOfProducts) {
        this.companyName = nameOfCompany;
        this.listOfProducts = listOfProducts;
    }

    public String getNameOfCompany() {
        return companyName;
    }

    public Map<String, Integer> getListOfProducts() {
        return listOfProducts;
    }

}
