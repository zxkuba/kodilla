package com.kodilla.good.patterns.foodtodoor;

import java.util.HashMap;
import java.util.Map;


public class ExtraFoodShop implements Supplier {

    private Map<String, Integer> warehouse = new HashMap<>();

    public ExtraFoodShop() {
        warehouse.put("Ziemniaki", 200);
    }

    @Override
    public boolean process(Product product, Integer count) {
        return warehouse.getOrDefault(product.getName(), 0) >= count;
    }
}
