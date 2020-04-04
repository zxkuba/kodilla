package com.kodilla.good.patterns.challenges;

public class DeliveryAddress {

    private String city;
    private String street;
    private int flatNumber;

    public DeliveryAddress(String city, String street, int flatNumber) {
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getFlatNumber() {
        return flatNumber;
    }
}
