package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private String ean;
    private BigDecimal price;

    public Product(String name, String ean, BigDecimal price) {
        this.name = name;
        this.ean = ean;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(ean, product.ean) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ean, price);
    }
}
