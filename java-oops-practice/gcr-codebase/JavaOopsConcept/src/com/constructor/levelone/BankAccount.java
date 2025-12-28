package com.constructor.levelone;

public class BankAccount {
	    public int accountNumber;
	    protected String accountHolder;
	    private double balance;

	    BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }
	    
	    public void setBalance(double amount) {
	        if (amount >= 0) {
	            balance = amount;
	        } else {
	            System.out.println("Invalid balance amount");
	        }
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	}

	class SavingsAccount extends BankAccount {

	    double interestRate;

	    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
	        super(accountNumber, accountHolder, balance);
	        this.interestRate = interestRate;
	    }

	    void displayAccountDetails() {
	        System.out.println(
	            "Account Number: " + accountNumber +
	            ", Account Holder: " + accountHolder +
	            ", Balance: ₹" + getBalance() +
	            ", Interest Rate: " + interestRate + "%"
	        );
	    }


}
