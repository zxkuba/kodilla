package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface OrderService {

    boolean order(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress);
}
