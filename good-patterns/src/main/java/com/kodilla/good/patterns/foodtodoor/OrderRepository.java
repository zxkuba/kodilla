package com.kodilla.good.patterns.foodtodoor;


import java.util.Map;

public interface OrderRepository {

    boolean createOrder(Customer customer, Map<Product, Integer> productMap);
}
