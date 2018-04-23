package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void pizzaOrderTest1() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new Meet(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        String description = pizza.getPizza();
        //Then
        assertEquals(new BigDecimal(21), cost);
        assertEquals("Pizza: cheese + tomato sauce + meet", description);
    }

    @Test
    public void pizzaOrderTest2() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new Meet(pizza);
        pizza = new DoubleCheese(pizza);
        pizza = new OtherIngredients(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        String description = pizza.getPizza();
        //Then
        assertEquals(new BigDecimal(35), cost);
        assertEquals("Pizza: cheese + tomato sauce + meet + double cheese + other ingredients", description);
    }
}
