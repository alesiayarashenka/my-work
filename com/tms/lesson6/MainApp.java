package com.tms.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Product [] list = {
                new Product(Type.TV, 3500, "Sony", true),
                new Product(Type.TV, 2500, "Horizont", false),
                new Product(Type.AUDIO, 500, "Yandex", true),
                new Product(Type.AUDIO, 600, "Yandex", true),
                new Product(Type.AUDIO, 1500, "Google", false),
                new Product(Type.MOBILE, 7500, "Apple", true),
                new Product(Type.MOBILE, 800, "Samsung", false),
        };

        ProductReport productReport = new ProductReport();

        productReport.priceOfProduct(list,Type.MOBILE);
//        productReport.priceOfProduct(list,Type.AUDIO);
//        productReport.priceOfProduct(list,Type.TV);

        productReport.exOfProduct(list,Type.AUDIO);



    }
}
