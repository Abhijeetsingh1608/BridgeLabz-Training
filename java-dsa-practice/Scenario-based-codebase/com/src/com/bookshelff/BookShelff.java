package com.bookshelff;
import java.util.*;
public class BookShelff {
	
	 private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

	    // To avoid duplicates (optional)
	    private HashSet<Book> uniqueBooks = new HashSet<>();

	    // Add book
	    public void addBook(String genre, Book book) {

	        if (uniqueBooks.contains(book)) {
	            System.out.println("Duplicate book not allowed");
	            return;
	        }

	        catalog.putIfAbsent(genre, new LinkedList<>());
	        catalog.get(genre).add(book);
	        uniqueBooks.add(book);

	        System.out.println("Book added: " + book.title);
	    }

	    // Borrow (remove) book
	    public void borrowBook(String genre, String title) {

	        if (!catalog.containsKey(genre)) {
	            System.out.println("Genre not found");
	            return;
	        }

	        LinkedList<Book> books = catalog.get(genre);

	        Iterator<Book> it = books.iterator();
	        while (it.hasNext()) {
	            Book book = it.next();
	            if (book.title.equals(title)) {
	                it.remove();
	                uniqueBooks.remove(book);
	                System.out.println("Book borrowed: " + title);
	                return;
	            }
	        }

	        System.out.println("Book not available");
	    }

	    // Display catalog
	    public void displayCatalog() {

	        for (String genre : catalog.keySet()) {
	            System.out.println("Genre: " + genre);

	            for (Book book : catalog.get(genre)) {
	                System.out.println("  - " + book.title + " by " + book.author);
	            }
	        }
	    }
	}

