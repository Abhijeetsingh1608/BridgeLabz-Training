package com.Scenariobased.MediStore;

import java.time.LocalDate;

public class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); // default quantity = 10
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated getter
    public int getQuantity() {
        return quantity;
    }

    // Sensitive pricing logic (PRIVATE)
    private double applyDiscount(double total) {
        if (total > 1000)
            return total * 0.9; // 10% discount
        return total;
    }

    // Operator usage
    public double calculateTotalPrice(int qty) {
        double total = price * qty;
        return applyDiscount(total);
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            quantity -= qty; // operator usage
            System.out.println(qty + " units sold.");
        } else {
            System.out.println("Sale failed (Out of stock / Expired)");
        }
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
