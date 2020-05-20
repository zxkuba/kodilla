package com.kodilla.patterns2.facade;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private ProductService productService;
    private List<Item> items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService = productService;
    }
}
