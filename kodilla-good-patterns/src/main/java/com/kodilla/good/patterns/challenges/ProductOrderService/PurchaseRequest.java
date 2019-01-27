package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User user;
    private LocalDateTime purchaseTime;
    private Item item;

    public PurchaseRequest(final User user, final LocalDateTime purchaseTime, final Item item){
        this.user = user;
        this.purchaseTime = purchaseTime;
        this.item = item;

    }

    public User getUser(){
        return user;
    }

    public LocalDateTime getPurchaseTime(){
        return purchaseTime;
    }

    public Item getItem() {
        return item;
    }
}
