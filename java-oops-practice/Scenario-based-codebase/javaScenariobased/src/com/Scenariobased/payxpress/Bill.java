package com.Scenariobased.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;          // internal only
    protected double amount;      // accessible to child classes
    private LocalDate dueDate;
    private boolean isPaid;

    // Constructor (supports recurring bills)
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Late fee calculation using operator
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Encapsulation: no direct setter for isPaid
    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getType() {
        return type;
    }
}
