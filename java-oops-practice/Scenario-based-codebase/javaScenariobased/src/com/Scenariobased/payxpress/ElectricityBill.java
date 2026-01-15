package com.Scenariobased.payxpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Electricity Bill Reminder: Power may be disconnected!");
    }
}
