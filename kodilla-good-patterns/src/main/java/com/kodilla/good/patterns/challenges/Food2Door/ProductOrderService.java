package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(Supplier supplier, Product product, LocalDateTime orderTime) {
        return true;
    }
}
