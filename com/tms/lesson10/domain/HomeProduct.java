package com.tms.lesson10.domain;

public class HomeProduct extends Product{

    public HomeProduct(String productName, int price, int amount) {
        super(productName, price, amount);
    }

    @Override
    public String toString() {
        return getProductName();
    }
}
