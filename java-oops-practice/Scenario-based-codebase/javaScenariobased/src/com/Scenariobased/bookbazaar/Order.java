package com.Scenariobased.bookbazaar;

class Order {
    private String userName;
    private Book book;
    private int quantity;
    private String orderStatus; // restricted update

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.orderStatus = "CREATED";
    }

    public double calculateTotalCost() {
        double discount = book.applyDiscount(quantity);
        return (book.getPrice() * quantity) - discount;
    }

    // Internal process only
    private void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void placeOrder() {
        if (book.reduceStock(quantity)) {
            setOrderStatus("CONFIRMED");
            System.out.println("Order placed successfully!");
        } else {
            setOrderStatus("FAILED");
            System.out.println("Insufficient stock!");
        }
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
