package com.smartlibrary;

public class SmartLibraryMain {
	 public static void main(String[] args) {

	        Book[] books = {
	            new Book("Java Programming"),
	            new Book("Data Structures"),
	            new Book("Algorithms"),
	            new Book("Computer Networks"),
	            new Book("Operating Systems")
	        };

	        SmartLibrary library = new SmartLibrary();

	        library.sortBooks(books);
	        library.displayBooks(books);
	    }

}
