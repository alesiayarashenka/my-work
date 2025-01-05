package com.tms.lesson10;
import com.tms.lesson10.domain.*;
import com.tms.lesson10.service.ProductCollectionService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Product product_1 = new Product("Marshall", 300, 12){
            @Override
            public String toString() {
                return getProductName();
            }
        };

        Product product_2 = new Product("Nokia", 400, 10){
            @Override
            public String toString() {
                return getProductName();
            }
        };
        Product product_3 = new Product("Philips", 800, 8){
            @Override
            public String toString() {
                return getProductName();
            }
        };

        List<Product> products = new ArrayList<>();

        ProductCollectionService productCollection = new ProductCollectionService();

        products.add(product_1);
        products.add(product_2);
        products.add(product_3);

        productCollection.getName(products, product_3.getProductName());

        productCollection.getPrice(products, 350);

        productCollection.getAmount(products);

        Product product_4 = new Product("Lamp", 150, 30){
            @Override
            public String toString() {
                return getProductName();
            }
        };

        products.add(2, product_4);

        System.out.println("Amount of elements in new collection is " + products.size());

        System.out.println("The new element " + products.get(2) + " in collection is added: " + products.contains(product_4));

        List<Product> sublist = products.subList(0, 3);
        System.out.println("The list contains last product: " + sublist);

        //---or

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) == products.getLast()) {
                break;
            }
            System.out.println(products.get(i));
        }

        List<Product> newList = new ArrayList<>();

        newList.addAll(products.reversed());

        System.out.println("New list: " + newList);

    }

}







