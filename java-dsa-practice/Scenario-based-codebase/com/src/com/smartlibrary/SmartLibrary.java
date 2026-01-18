package com.smartlibrary;

class SmartLibrary {

    void sortBooks(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            // Move books with greater titles to one position ahead
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    void displayBooks(Book[] books) {
        System.out.println("Borrowed books in alphabetical order:");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}
