package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDateTime;

public class PurchaseDto {

    private User user;
    private boolean isPurchased;

    public PurchaseDto(final User user, final boolean isPurchased) {
        this.user = user;
        this.isPurchased = isPurchased;
    }

    public User getUser() {
        return user;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
