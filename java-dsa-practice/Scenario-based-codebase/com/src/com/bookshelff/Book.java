package com.bookshelff;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // To avoid duplicate books (optional requirement)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}