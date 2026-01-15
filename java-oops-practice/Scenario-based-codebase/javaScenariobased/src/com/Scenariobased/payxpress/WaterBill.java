package com.Scenariobased.payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water Bill Reminder: Please clear dues to avoid supply issues");
    }
}
