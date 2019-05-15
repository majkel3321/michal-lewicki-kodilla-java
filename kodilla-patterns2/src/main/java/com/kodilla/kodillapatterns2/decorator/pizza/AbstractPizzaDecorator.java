package com.kodilla.kodillapatterns2.decorator.pizza;

public class AbstractPizzaDecorator implements Pizza {

    private final Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double getCost(){
        return pizza.getCost();
    }

    @Override
    public String getIngredients(){
        return pizza.getIngredients();
    }
}
