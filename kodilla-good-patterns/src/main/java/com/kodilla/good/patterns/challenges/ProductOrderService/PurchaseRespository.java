package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDateTime;

public interface PurchaseRespository {

    public boolean createPurchase(User user, LocalDateTime purchaseTime);
}
