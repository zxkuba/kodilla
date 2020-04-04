package com.kodilla.good.patterns.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(Product product, Integer count) {
        Map<Product, Integer> map = new HashMap<>();
        map.put(product, count);
        map.entrySet().stream();

        return false;
    }
}
