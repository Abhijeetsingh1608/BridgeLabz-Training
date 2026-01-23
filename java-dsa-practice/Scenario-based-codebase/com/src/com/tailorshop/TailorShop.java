package com.tailorshop;

import java.util.ArrayList;

public class TailorShop {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order newOrder) {

        int i = orders.size() - 1;

        while (i >= 0 && orders.get(i).getDeadline() > newOrder.getDeadline()) {
            i--;
        }

        orders.add(i + 1, newOrder);
        System.out.println("✅ Order added: " + newOrder);
    }

    public void displayOrders() {
        System.out.println("\n🧾 Orders by Delivery Deadline:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
