package com.kodilla.good.patterns.foodtodoor;

public class Customer {

    private String firstName;
    private String lastName;
    private String mail;
    private String address;

    public Customer(String firstName, String lastName, String mail, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }
}
