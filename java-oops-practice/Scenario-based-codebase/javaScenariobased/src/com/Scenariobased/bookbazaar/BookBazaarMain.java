package com.Scenariobased.bookbazaar;

public class BookBazaarMain {
	public static void main(String[] args) {

        Book ebook = new EBook("Java Mastery", "James Gosling", 500, 50);
        Book printedBook = new PrintedBook("Clean Code", "Robert C. Martin", 700, 10);

        Order order1 = new Order("Abhijeet", ebook, 2);
        order1.placeOrder();
        System.out.println("Total Cost: ₹" + order1.calculateTotalCost());
        System.out.println("Order Status: " + order1.getOrderStatus());

        System.out.println("--------------------------------");

        Order order2 = new Order("Abhijeet", printedBook, 2);
        order2.placeOrder();
        System.out.println("Total Cost: ₹" + order2.calculateTotalCost());
        System.out.println("Order Status: " + order2.getOrderStatus());
    }

}
