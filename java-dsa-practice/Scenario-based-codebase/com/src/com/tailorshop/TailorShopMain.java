package com.tailorshop;

public class TailorShopMain{

    public static void main(String[] args) {

        TailorShop shop = new TailorShop();

        shop.addOrder(new Order(101, "Rahul", 5));
        shop.addOrder(new Order(102, "Amit", 7));
        shop.addOrder(new Order(103, "Neha", 10));
        shop.addOrder(new Order(104, "Priya", 6));

        shop.displayOrders();
    }
}

