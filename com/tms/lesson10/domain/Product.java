package com.tms.lesson10.domain;

public class Product {

    private String productName;

    private int price;

    private int amount;

    public Product(String productName, int price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return getProductName();
    }


}
