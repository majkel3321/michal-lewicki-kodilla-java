package com.kodilla.good.patterns.challenges.ProductOrderService;

public class PurchaseProcessor {

    private InformationService informationService;
    private PurchaseRespository purchaseRespository;
    private PurchaseService purchaseService;

    public PurchaseProcessor(final InformationService informationService,
                             final PurchaseRespository purchaseRespository,
                             final PurchaseService purchaseService){

        this.informationService = informationService;
        this.purchaseRespository = purchaseRespository;
        this.purchaseService = purchaseService;
    }


    public PurchaseDto process(final PurchaseRequest purchaseRequest){

        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getPurchaseTime());

        if (isPurchased){
            informationService.inform(purchaseRequest.getUser());
            purchaseRespository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getPurchaseTime());
            return new PurchaseDto(purchaseRequest.getUser(),true);
        }
        else{
            return new PurchaseDto(purchaseRequest.getUser(),false);
        }
    }

}
