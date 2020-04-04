package com.kodilla.good.patterns.foodtodoor;


import java.util.Map;


public class OrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderService(InformationService informationService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public boolean order(OrderDto orderDto) {
        for (Map.Entry<Product, Integer> entry : orderDto.getProducts().entrySet()) {
            if (!entry.getKey().getProducer().process(entry.getKey(), entry.getValue())) {
                orderDto.isOrdered = false;
                System.out.println("Brak produktu w wystarczającej ilości: " + entry.getKey());
            }
        }
        if (orderDto.isOrdered) {
            informationService.inform(orderDto.getCustomer());
            orderRepository.createOrder(orderDto.getCustomer(), orderDto.getProducts());
            return true;
        } else {
            informationService.inform(orderDto.getCustomer());
            return false;
        }
    }
}
