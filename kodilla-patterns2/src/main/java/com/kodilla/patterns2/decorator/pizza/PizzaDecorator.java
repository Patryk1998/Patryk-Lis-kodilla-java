package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements PizzaOrder {
    private PizzaOrder pizzaOrder;

    public PizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getPizza() {
        return pizzaOrder.getPizza();
    }
}
