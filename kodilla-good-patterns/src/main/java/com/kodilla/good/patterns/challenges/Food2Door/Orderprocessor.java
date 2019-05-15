package com.kodilla.good.patterns.challenges.Food2Door;

public class Orderprocessor {

    private OrderService orderService;

    public Orderprocessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getSupplier(), orderRequest.getProduct(), orderRequest.getOrderTime());

        return new OrderDto(orderRequest.getSupplier(), isOrdered);
    }
}
