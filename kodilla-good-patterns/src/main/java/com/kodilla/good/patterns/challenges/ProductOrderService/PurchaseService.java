package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDateTime;

public interface PurchaseService {

    public boolean purchase(User user, LocalDateTime purchaseTime);
}
