package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheese extends PizzaDecorator {
    public DoubleCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getPizza() {
        return super.getPizza() + " + double cheese";
    }
}
