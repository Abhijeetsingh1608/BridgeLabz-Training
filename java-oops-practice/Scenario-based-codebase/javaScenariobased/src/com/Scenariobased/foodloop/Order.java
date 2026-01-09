package com.Scenariobased.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
            total += item.getPrice();
        }
    }

    @Override
    public void placeOrder() {   // ✅ EXACT MATCH
        double finalAmount = applyDiscount();
        System.out.println("Order placed. Amount: ₹" + finalAmount);
    }

    @Override
    public void cancelOrder() {  // ✅ EXACT MATCH
        System.out.println("Order cancelled");
    }

    protected double applyDiscount() {
        if (total >= 1500) return total * 0.85;
        if (total >= 1000) return total * 0.90;
        return total;
    }
}
