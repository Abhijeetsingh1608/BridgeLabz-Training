package com.Scenariobased.bookbazaar;

class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat ₹50 discount if buying 2 or more printed books
        if (quantity >= 2) {
            return 50;
        }
        return 0;
    }
}
