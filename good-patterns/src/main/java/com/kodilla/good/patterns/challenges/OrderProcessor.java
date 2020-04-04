package com.kodilla.good.patterns.challenges;


public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }


    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct(),
                orderRequest.getDeliveryAddress());

        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getDeliveryAddress());
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(),
                    orderRequest.getDeliveryAddress(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(),
                    orderRequest.getDeliveryAddress(),
                    false);
        }
    }
}
