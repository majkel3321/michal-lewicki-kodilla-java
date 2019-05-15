package com.kodilla.kodillapatterns2.decorator.pizza;

public class ExtraSalamiDecorator extends AbstractPizzaDecorator {

    public ExtraSalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }
}
