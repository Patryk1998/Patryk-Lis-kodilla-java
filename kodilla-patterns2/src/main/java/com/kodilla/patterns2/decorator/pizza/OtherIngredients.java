package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OtherIngredients extends PizzaDecorator {
    public OtherIngredients(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getPizza() {
        return super.getPizza() + " + other ingredients";
    }
}
