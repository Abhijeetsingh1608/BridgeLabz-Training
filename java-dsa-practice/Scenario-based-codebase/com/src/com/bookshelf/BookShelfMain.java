package com.bookshelf;

public class BookShelfMain {
    public static void main(String[] args) {

        LibraryShelf library = new LibraryShelf();

        Book b1 = new Book("B101", "Clean Code", "Robert Martin");
        Book b2 = new Book("B102", "Effective Java", "Joshua Bloch");
        Book b3 = new Book("B103", "Java Concurrency", "Brian Goetz");

        library.addBook("Programming", b1);
        library.addBook("Programming", b2);
        library.addBook("Programming", b3);

        library.displayCatalog();

        library.borrowBook("Programming", "B102");

        library.displayCatalog();
    }
}
