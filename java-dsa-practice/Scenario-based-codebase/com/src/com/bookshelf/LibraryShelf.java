package com.bookshelf;

import java.util.*;

class LibraryShelf {

    // Genre → List of Books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // To avoid duplicate books
    private HashSet<String> bookIds = new HashSet<>();

    // Add book (Return book)
    public void addBook(String genre, Book book) {

        if (bookIds.contains(book.id)) {
            System.out.println("❌ Duplicate book not allowed: " + book.title);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookIds.add(book.id);

        System.out.println("✅ Book added: " + book.title);
    }

    // Borrow book (Remove book)
    public void borrowBook(String genre, String bookId) {

        if (!catalog.containsKey(genre)) {
            System.out.println("❌ Genre not found");
            return;
        }

        LinkedList<Book> books = catalog.get(genre);
        Iterator<Book> itr = books.iterator();

        while (itr.hasNext()) {
            Book b = itr.next();
            if (b.id.equals(bookId)) {
                itr.remove();          // Efficient delete
                bookIds.remove(bookId);
                System.out.println("📕 Book borrowed: " + b.title);
                return;
            }
        }
        System.out.println("❌ Book not found");
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  - " + b);
            }
        }
    }
}
