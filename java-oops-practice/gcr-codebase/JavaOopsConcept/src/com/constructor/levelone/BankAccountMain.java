package com.constructor.levelone;

public class BankAccountMain {
	public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(
                12345, "Abhijeet", 10000, 4.5
        );
        sa.displayAccountDetails();
        sa.deposit(5000);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
