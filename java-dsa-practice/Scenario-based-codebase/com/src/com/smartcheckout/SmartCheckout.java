package com.smartcheckout;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> customerQueue = new LinkedList<>();
    HashMap<String, Item> inventory = new HashMap<>();

    // Add item to inventory
    public void addItem(String name, int price, int stock) {
        inventory.put(name, new Item(price, stock));
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.name + " added to queue");
    }

    // Remove customer and bill
    public void billCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        int total = 0;

        for (String itemName : customer.items) {
            Item item = inventory.get(itemName);

            if (item != null && item.stock > 0) {
                total += item.price;
                item.stock--;   // update stock
            } else {
                System.out.println(itemName + " is out of stock");
            }
        }

        System.out.println(customer.name + " total bill: ₹" + total);
    }

    // Show remaining stock
    public void showStock() {
        for (String key : inventory.keySet()) {
            Item item = inventory.get(key);
            System.out.println(key + " -> Stock: " + item.stock);
        }
    }
}
