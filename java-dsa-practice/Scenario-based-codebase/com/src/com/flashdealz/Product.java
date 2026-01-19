package com.flashdealz;

public class Product {

    private int id;
    private String name;
    private double discount;

    public Product(int id, String name, double discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + discount + "%";
    }
}
