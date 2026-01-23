package com.tailorshop;

public class Order {
    private int orderId;
    private String customerName;
    private int deadline; // days from today

    public Order(int orderId, String customerName, int deadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deadline = deadline;
    }

    public int getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Order " + orderId +
               " | " + customerName +
               " | Deadline: " + deadline + " days";
    }
}
