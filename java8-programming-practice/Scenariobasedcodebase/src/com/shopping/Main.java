package com.shopping;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Mouse", 400));
        products.add(new Product(3, "Keyboard", 800));
        products.add(new Product(4, "Headphones", 1200));
        products.add(new Product(5, "USB Cable", 300));

        // 1️⃣ Lambda to apply 10% discount
        System.out.println("After 10% Discount:");
        products.forEach(p -> {
            double discountedPrice = p.getPrice() * 0.90;
            p.setPrice(discountedPrice);
            System.out.println(p.getName() + " -> " + discountedPrice);
        });

        // 2️⃣ Sort products by price using lambda
        products.sort((p1, p2) ->
            Double.compare(p1.getPrice(), p2.getPrice())
        );
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        // 3️⃣ Lambda to check free delivery eligibility (price > 500)
        System.out.println("\nFree Delivery Eligibility:");
        products.forEach(p -> {
            if (p.getPrice() > 500)
                System.out.println(p.getName() + " : Free Delivery");
            else
                System.out.println(p.getName() + " : Delivery Charges Apply");
        });

        // 4️⃣ Lambda to calculate final bill amount
        double totalBill =
            products.stream()
                    .mapToDouble(Product::getPrice)
                    .sum();
        System.out.println("\nFinal Bill Amount: " + totalBill);

        // 5️⃣ Lambda to print product names
        System.out.println("\nProduct Names:");
        products.forEach(p ->
            System.out.println(p.getName())
        );
    }
}
