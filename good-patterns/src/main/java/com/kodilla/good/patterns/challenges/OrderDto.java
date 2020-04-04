package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class OrderDto {

    public Customer customer;
    public Map<Product, Integer> product;
    public DeliveryAddress deliveryAddress;
    public boolean isOrdered;

    public OrderDto(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress, boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.deliveryAddress = deliveryAddress;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProduct() {
        return product;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
