package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {

    @Test
    public void testPizzaNew() {

        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushroom")
                .build();

        System.out.println(pizza);

        int howManyIngredients = pizza.getIngredients().size();

        Assert.assertEquals(3, howManyIngredients);

    }
}
