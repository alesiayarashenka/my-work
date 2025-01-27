package com.tms.lesson10;
import com.tms.lesson10.domain.*;
import com.tms.lesson10.service.ProductCollectionService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Product product1 = new Product("Marshall", 300, 12);

        Product product2 = new Product("Nokia", 400, 10);

        Product product3 = new Product("Philips", 800, 8);

        List<Product> products = new ArrayList<>();

        ProductCollectionService productCollection = new ProductCollectionService();

        products.add(product1);
        products.add(product2);
        products.add(product3);

        var result = productCollection.searchByProduct(products, String.valueOf(product3));

        System.out.println("Product " + result + " was found");

        int priceValue = 350;

        var result1 = productCollection.searchByPrice(products, priceValue);

        System.out.println("The product price of " + result1 + " is more expensive then " + priceValue);

        var result3 = productCollection.countAmountOfProducts(products);

        System.out.println("The amount of all products is  " + result3);

        Product product4 = new Product("Lamp", 150, 30);

        products.add(2, product4);

        System.out.println("Amount of elements in new collection is " + products.size());

        System.out.println("The new element " + products.get(2) + " in collection is added: " + products.contains(product4));

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







