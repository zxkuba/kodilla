package com.kodilla.good.patterns.challenges;


import java.time.LocalDate;
import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private Map<Product, Integer> product;
    private DeliveryAddress deliveryAddress;
    private LocalDate orderDate;

    public OrderRequest(Customer customer, Map<Product, Integer> product, DeliveryAddress deliveryAddress, LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.deliveryAddress = deliveryAddress;
        this.orderDate = orderDate;
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

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

