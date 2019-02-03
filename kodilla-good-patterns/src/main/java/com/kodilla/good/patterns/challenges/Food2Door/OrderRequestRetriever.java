package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        Supplier supplier = new Supplier("Unhealthy Food","Fruits");
        Product product = new Product("Oranges",150);
        LocalDateTime orderTime = LocalDateTime.of(2019,2,15,14,22);

        return new OrderRequest(supplier,product,orderTime);
    }
}
