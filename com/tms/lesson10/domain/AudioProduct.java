package com.tms.lesson10.domain;

public class AudioProduct extends Product{

    public AudioProduct(String productName, int price, int amount) {
        super(productName, price, amount);
    }

    @Override
    public String toString() {
        return getProductName();
    }

}
