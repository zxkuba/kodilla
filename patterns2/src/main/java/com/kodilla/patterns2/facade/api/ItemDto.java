package com.kodilla.patterns2.facade.api;

public final class ItemDto {

    private final Long productID;
    private final double quantity;

    public ItemDto(final Long productID, final double quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    public Long getProductID() {
        return productID;
    }

    public double getQuantity() {
        return quantity;
    }
}
