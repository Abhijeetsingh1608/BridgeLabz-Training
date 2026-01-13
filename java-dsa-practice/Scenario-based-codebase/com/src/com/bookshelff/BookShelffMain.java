package com.bookshelff;

public class BookShelffMain {
	 public static void main(String[] args) {

	        BookShelff shelf = new BookShelff();

	        Book b1 = new Book("Java Basics", "James");
	        Book b2 = new Book("DSA Mastery", "Robert");
	        Book b3 = new Book("Java Basics", "James"); // duplicate

	        shelf.addBook("Programming", b1);
	        shelf.addBook("Programming", b2);
	        shelf.addBook("Programming", b3); // blocked

	        shelf.displayCatalog();

	        shelf.borrowBook("Programming", "Java Basics");
	        shelf.displayCatalog();
	    }
	}


