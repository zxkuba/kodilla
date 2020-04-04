package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress) {
        return false;
    }
}
