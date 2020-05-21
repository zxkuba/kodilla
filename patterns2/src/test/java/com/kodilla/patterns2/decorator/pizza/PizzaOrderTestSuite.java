package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void pizzaOrderCapricciosaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosa(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(45), theCost);
    }

    @Test
    public void pizzaOrderCapricciosaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosa(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order a pizza with cheese, ham, mushrooms, artichokes, tomatoes + extra cheese", description);

    }

    @Test
    public void pizzaOrderCapricciosaWithExtraCheeseWithFriedEggGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosa(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new FriedEggDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //Given
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(50), theCost);
    }

    @Test
    public void pizzaOrderCapricciosaWithExtraCheeseWithFriedEggGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosa(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new FriedEggDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //Given
        String description = pizzaOrder.getDescription();
        assertEquals("Order a pizza with cheese, ham, mushrooms, artichokes, tomatoes + extra cheese + fried egg", description);
    }

}