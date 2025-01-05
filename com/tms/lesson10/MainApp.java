package com.tms.lesson10;
import com.tms.lesson10.domain.*;
import com.tms.lesson10.service.ProductCollectionService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Product product_1 = new AudioProduct("Marshall", 300, 12);
        Product product_2 = new PhoneProduct("Nokia", 400, 10);
        Product product_3 = new TvProduct("Philips", 800, 8);

        List<Product> products = new ArrayList<>();

        ProductCollectionService productCollection = new ProductCollectionService();

        products.add(product_1);
        products.add(product_2);
        products.add(product_3);

        productCollection.getName(products, product_3.getProductName());

        productCollection.getPrice(products, 350);

        productCollection.getAmount(products);

        Product product_4 = new HomeProduct("Lamp", 150, 30);

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







