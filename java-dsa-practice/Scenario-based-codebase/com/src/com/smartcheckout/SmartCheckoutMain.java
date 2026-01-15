package com.smartcheckout;

import java.util.Arrays;

public class SmartCheckoutMain {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        // Add items
        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 30, 2);
        checkout.addItem("Eggs", 10, 12);

        // Add customers
        Customer c1 = new Customer("Rahul",
                Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Anita",
                Arrays.asList("Eggs", "Milk"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        // Billing
        checkout.billCustomer();
        checkout.billCustomer();

        // Remaining stock
        checkout.showStock();
    }
}
