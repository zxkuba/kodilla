package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface OrderRepository {

    boolean createOrder(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress);
}
