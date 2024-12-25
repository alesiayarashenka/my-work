package com.tms.lesson6;

public class ProductReport {

    public int priceOfProduct(Product[] list, Type type) {
        int i = 0;
        int price= 0;
        for (; i < list.length;i++) {
            if (type == list[i].getType()) {
               int val = list[i].getPrice();
               price += val;
            }

        }
        return price;
    }

    public int exOfProduct(Product[] list, Type type) {
        int i = 1;
        int sum = 0;
        for (Product product : list) {
            if ((type == product.getType() && product.isExistence())) {
                sum +=i;
            }
        }
        return sum;
    }
}