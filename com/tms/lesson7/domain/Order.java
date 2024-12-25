package com.tms.lesson7.domain;

public class Order {

    private int number;

    private int amount;

    private String product;

    private boolean address;

    private boolean payment;

    private String phone;

    private String username;

    public Order(String product, int number, int amount, boolean homeAddress, boolean payment, String phone, String username) {
        this.address = homeAddress;
        this.product = product;
        this.number = number;
        this.amount = amount;
        this.payment = payment;
        this.phone = phone;
        this.username = username;
    }
    public String getProduct() {
        return product;
    }

    public int getNumber() { return number; }

    public int getAmount() {
        return amount;
    }

    public boolean isAddress() { return address; }

    public boolean isPayment() { return payment; }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }
}

