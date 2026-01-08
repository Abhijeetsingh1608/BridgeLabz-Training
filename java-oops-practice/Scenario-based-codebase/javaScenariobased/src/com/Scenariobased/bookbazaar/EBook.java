package com.Scenariobased.bookbazaar;

class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // 10% discount on eBooks
        return price * quantity * 0.10;
    }
}
