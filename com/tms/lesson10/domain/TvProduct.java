package com.tms.lesson10.domain;

public class TvProduct extends Product{

    public TvProduct(String productName, int price, int amount) {
        super(productName, price, amount);
    }

    @Override
    public String toString() {
        return getProductName();
    }

}
