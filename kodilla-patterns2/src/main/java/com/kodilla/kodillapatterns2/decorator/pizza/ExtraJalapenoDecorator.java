package com.kodilla.kodillapatterns2.decorator.pizza;

public class ExtraJalapenoDecorator extends AbstractPizzaDecorator {

    public ExtraJalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", jalapeno";
    }
}
