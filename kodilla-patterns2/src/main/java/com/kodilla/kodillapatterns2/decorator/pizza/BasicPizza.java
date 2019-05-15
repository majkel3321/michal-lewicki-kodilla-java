package com.kodilla.kodillapatterns2.decorator.pizza;

public class BasicPizza implements Pizza {

    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getIngredients() {
        return "Ingredients: cheese, sauce";
    }
}
