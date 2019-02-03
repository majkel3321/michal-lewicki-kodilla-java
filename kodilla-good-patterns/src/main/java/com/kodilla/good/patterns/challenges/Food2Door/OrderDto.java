package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

    private Supplier supplier;
    private boolean isOrdered;

    public OrderDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }


}
