package com.kodilla.good.patterns.challenges;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Customer customer = new Customer("Jan", "Kowalski");
        Map<Product, Integer> product = new HashMap<>();
        DeliveryAddress deliveryAddress = new DeliveryAddress("Breslau", "Hohenzollernstrasse", 25);
        LocalDate orderDate = LocalDate.of(2020, 12, 15);


        return new OrderRequest(customer, product, deliveryAddress, orderDate);
    }
}
