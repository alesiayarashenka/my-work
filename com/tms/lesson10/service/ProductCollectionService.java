package com.tms.lesson10.service;

import com.tms.lesson10.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollectionService {

    public List<Product> getName(List<Product> products, String val) {
        List<Product> dest = new ArrayList<>();
        for (Product p : products) {
            if (p.getProductName().equals(val)) {
                dest.add(p);
            }
        }
        return dest;
    }

    public List<Product> getPrice(List<Product> products, int val) {
        List<Product> dest = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > val) {
                dest.add(product);
            }
        }
        return dest;
    }

    public int getAmount(List<Product> products) {
        int amount = 0;
        for (Product product : products) {
            amount += product.getAmount();
        }
        return amount;
    }
}

