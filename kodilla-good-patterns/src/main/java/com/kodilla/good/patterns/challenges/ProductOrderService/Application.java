package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Application {
    public static void main(String[] args) {

        PurchaseRequestRetreiver purchaseRequestRetreiver = new PurchaseRequestRetreiver();
        PurchaseRequest purchaseRequest = purchaseRequestRetreiver.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new SmsService(),
                new ItemPurchaseRespository(), new ItemPurchaseService());

        purchaseProcessor.process(purchaseRequest);


    }
}
