package com.tms.lesson10.service;

import com.tms.lesson10.domain.Product;

import java.util.List;

public class ProductCollectionService {

    public void getName(List<Product> products, String val) {
        for (Product product : products) {
            if (val == product.getProductName()) {
                System.out.println("Product " + product.getProductName() + " was found");
            }
        }
    }

    public void getPrice(List<Product> products, int val) {
        for (Product product : products) {
            if (val < product.getPrice()) {
                System.out.println("The product price of " + product.getProductName() + " is more expensive then " + val);
            }
        }
    }

    public void getAmount(List<Product> products) {
        int i = 0;
        for (Product product : products) {
            i += product.getAmount();
        }
        System.out.println("The amount of all products is  " + i);
    }
}

