package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress) {
        return false;
    }
}
