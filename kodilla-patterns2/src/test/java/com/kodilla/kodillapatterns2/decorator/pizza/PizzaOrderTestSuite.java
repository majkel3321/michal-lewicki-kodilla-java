package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithExtraCheeseSalamiJalapenoHerbsGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraSalamiDecorator(pizza);
        pizza = new ExtraJalapenoDecorator(pizza);
        pizza = new ExtraHerbsDecorator(pizza);
        //When
        double theCost = pizza.getCost();
        System.out.println(theCost);
        //Then
        assertEquals(25,theCost,0.001);
    }

    @Test
    public void testPizzaWithExtraCheeseSalamiJalapenoHerbsGetIngredients(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraSalamiDecorator(pizza);
        pizza = new ExtraJalapenoDecorator(pizza);
        pizza = new ExtraHerbsDecorator(pizza);
        //When
        String ingredients = pizza.getIngredients();
        System.out.println(ingredients);
        //Then
        assertEquals("Ingredients: cheese, sauce, cheese, salami, jalapeno, herbs",ingredients);
    }
}
