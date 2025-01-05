package com.tms.lesson10.domain;

public class PhoneProduct extends Product{

    public PhoneProduct(String productName, int price, int amount) {
        super(productName, price, amount);
    }


    @Override
    public String toString() {
        return getProductName();
    }
}
