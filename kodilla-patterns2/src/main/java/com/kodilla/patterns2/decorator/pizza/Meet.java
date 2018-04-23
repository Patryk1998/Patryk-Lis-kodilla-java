package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Meet extends PizzaDecorator {
    public Meet(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getPizza() {
        return super.getPizza() + " + meet";
    }
}
