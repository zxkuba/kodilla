package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FriedEggDecorator extends AbstractPizzaOrderDecorator {
    public FriedEggDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fried egg";
    }
}
