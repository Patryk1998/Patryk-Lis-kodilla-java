package com.kodilla.good.patterns.Food2Door;

import java.util.Scanner;

public final class Order {

    private final String nameOfProduct;
    private final int quantityToOrder;

    public Order(final String nameOfProduct, final int quantityToOrder) {
        this.nameOfProduct = nameOfProduct;
        this.quantityToOrder = quantityToOrder;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityToOrder() {
        return quantityToOrder;
    }
}
