package com.Scenariobased.foodloop;

public class FoodLoopMain {

    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 300, 5);
        FoodItem burger = new VegItem("Veg Burger", 150, 10);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 450, 3);
        FoodItem fish = new NonVegItem("Fish Fry", 400, 2);

        Order order = new Order();

        // Creating custom combo meal
        order.addItem(paneer);
        order.addItem(burger);
        order.addItem(chicken);
        order.addItem(fish);

        System.out.println();

        // Place order
        order.placeOrder();
    }
}
