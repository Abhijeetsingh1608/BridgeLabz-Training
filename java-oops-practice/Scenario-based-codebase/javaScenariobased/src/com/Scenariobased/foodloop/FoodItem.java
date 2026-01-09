package com.Scenariobased.foodloop;

public class FoodItem {

    protected String name;
    protected String category;
    protected double price;

    // Encapsulation: stock hidden
    private int availability;

    public FoodItem(String name, String category, double price, int availability) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    public boolean isAvailable() {
        return availability > 0;
    }

    // 🔥 MUST be public
    public void reduceStock() {
        availability--;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
