package com.kodilla.good.patterns.foodtodoor;

public class HealthyShop implements Supplier {

    WarehouseOfHealthyShop warehouseOfHealthyShop;

    @Override
    public boolean process(Product product, Integer count) {
        return warehouseOfHealthyShop.getWarehouse().getOrDefault(product.getName(), 0) >= count;
    }
}
