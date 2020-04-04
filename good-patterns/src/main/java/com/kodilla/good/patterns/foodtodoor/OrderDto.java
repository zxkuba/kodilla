package com.kodilla.good.patterns.foodtodoor;

import java.util.Map;

public class OrderDto {

    private Customer customer;
    private Map<Product, Integer> products;
    boolean isOrdered;


    public OrderDto(Customer customer, Map<Product, Integer> products, boolean isOrdered) {
        this.customer = customer;
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
