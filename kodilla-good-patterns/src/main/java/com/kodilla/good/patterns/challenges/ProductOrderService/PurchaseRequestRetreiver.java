package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDateTime;

public class PurchaseRequestRetreiver {

    public PurchaseRequest retrieve() {

        User user = new User("John", "Doe");
        LocalDateTime purchaseTime = LocalDateTime.of(2019, 2, 9, 14, 55);
        Item item = new Item("hammer", 15);

        return new PurchaseRequest(user, purchaseTime, item);
    }


}
