package com.constructor.levelone;

public class BookLibraryMain {
	public static void main(String[] args) {
        BookLibrary book = new BookLibrary(
                "978-0135166307",
                "Core Java",
                "Herbert Schildt"
        );
        book.displayBookDetails();
        book.setAuthor("H. Schildt");
        System.out.println("Updated Author: " + book.getAuthor());
    }
}
