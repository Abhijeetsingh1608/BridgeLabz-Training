package com.lambdaepressions;		
import java.util.Arrays;
import java.util.List;
public class CustomSorting {
		interface Product {
		String getName();
		double getPrice();
		double getRating();
		double getDiscount();
	}

	static class Item implements Product {
		private String name;
		private double price;
		private double rating;
		private double discount;

		public Item(String name, double price, double rating, double discount) {
			this.name = name;
			this.price = price;
			this.rating = rating;
			this.discount = discount;
		}

		public String getName() { return name; }
		public double getPrice() { return price; }
		public double getRating() { return rating; }
		public double getDiscount() { return discount; }
	}

	public static void main(String[] args) {
		List<Item> products = Arrays.asList(
			new Item("Product A", 100.0, 4.5, 10.0),
			new Item("Product B", 150.0, 4.0, 20.0),
			new Item("Product C", 120.0, 4.8, 15.0)
		);

		products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		System.out.println("Sorted by Price:");
		products.forEach(p -> System.out.println(p.getName() + ": $" + p.getPrice()));

		products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
		System.out.println("\nSorted by Rating:");
		products.forEach(p -> System.out.println(p.getName() + ": " + p.getRating() + " stars"));

		products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
		System.out.println("\nSorted by Discount:");
		products.forEach(p -> System.out.println(p.getName() + ": " + p.getDiscount() + "% off"));
	}

}
