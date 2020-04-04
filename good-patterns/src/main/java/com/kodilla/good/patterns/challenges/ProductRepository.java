package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<Product, Integer> productMap = new HashMap<>();
    private Product product;
    private int productItems;

    public ProductRepository(Map<Product, Integer> productMap, Product product, int productItems) {
        this.productMap = productMap;
        this.product = product;
        this.productItems = productItems;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductItems() {
        return productItems;
    }

    public void setProductItems(int productItems) {
        this.productItems = productItems;
    }

    public Map<Product, Integer> addProduct() {
        productMap.put(product, productItems);

        return productMap;
    }

}
