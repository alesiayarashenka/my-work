package com.tms.lesson6;

public class Product {

    private int price;

    private String name;

    private boolean existence;

    private Type type;

    public boolean isExistence() {
        return existence;
    }

    public Product(Type type, int price, String name, boolean existence) {
        this.type = type;
        this.price = price;
        this.name = name;
        this.existence = existence;

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExistence(boolean existence) {
        this.existence = existence;
    }


}
