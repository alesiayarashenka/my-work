package com.tms.lesson6;

public class ProductReport {

    public void priceOfProduct(Product[] list, Type type) {
        for (Product product : list) {
            if (type == product.getType()) {
                System.out.println(product.getPrice());
            }
        }
    }

    public void exOfProduct(Product[] list, Type type) {
        int i = 1;
        int sum = 0;
        for (Product product : list) {
            if ((type == product.getType() && product.isExistence()) == true) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}