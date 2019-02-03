package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface Order {

    public Supplier getSupplier();
    public Product getProduct();
    public LocalDateTime getOrderTime();

}
