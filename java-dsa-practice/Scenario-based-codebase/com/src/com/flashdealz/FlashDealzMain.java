package com.flashdealz;

public class FlashDealzMain {
	 public static void main(String[] args) {

	        Product[] products = {
	            new Product(101, "Laptop", 30.5),
	            new Product(102, "Phone", 55.0),
	            new Product(103, "Headphones", 40.0),
	            new Product(104, "Camera", 25.0),
	            new Product(105, "SmartWatch", 55.0)
	        };

	        QuickSorter.quickSort(products, 0, products.length - 1);

	        System.out.println("Top Discounted Products:");

	        for (Product p : products) {
	            System.out.println(p);
	        }
	    }

}
