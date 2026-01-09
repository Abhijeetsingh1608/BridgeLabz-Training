package com.Scenariobased.artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    // Operator usage: balance deduction
    public void deductBalance(double amount) {
        walletBalance -= amount;
    }

    public String getName() {
        return name;
    }
}
