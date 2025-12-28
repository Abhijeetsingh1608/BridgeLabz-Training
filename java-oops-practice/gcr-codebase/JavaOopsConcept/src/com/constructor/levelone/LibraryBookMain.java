package com.constructor.levelone;

public class LibraryBookMain {
	public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Core Java", "Herbert Schildt", 550);

        book.display();
        book.borrowBook();
        book.display();
    }

}
