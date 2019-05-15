package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class OrderRequest implements Order {

    private Supplier supplier;
    private Product product;
    private LocalDateTime orderTime;

    public OrderRequest(Supplier supplier, Product product, LocalDateTime orderTime) {
        this.supplier = supplier;
        this.product = product;
        this.orderTime = orderTime;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
