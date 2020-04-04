package com.kodilla.good.patterns.foodtodoor;


import java.util.HashMap;
import java.util.Map;

public class WarehouseOfHealthyShop {

    private Map<String, Integer> warehouse = new HashMap<>();

    public WarehouseOfHealthyShop() {
        warehouse.put("Błonnik", 2);
        warehouse.put("Otręby", 3);
        warehouse.put("Spirulina", 1000);
    }

    public Map<String, Integer> getWarehouse() {
        return warehouse;
    }
}



