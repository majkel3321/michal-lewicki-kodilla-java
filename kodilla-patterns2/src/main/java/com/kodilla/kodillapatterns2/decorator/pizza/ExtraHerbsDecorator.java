package com.kodilla.kodillapatterns2.decorator.pizza;

public class ExtraHerbsDecorator extends AbstractPizzaDecorator {

    public ExtraHerbsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", herbs";
    }
}
