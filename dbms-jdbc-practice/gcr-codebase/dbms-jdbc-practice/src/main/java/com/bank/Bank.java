package com.bank;

public class Bank {
	
	private double balance;
	public Bank(double amount){
		this.balance = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) throws MyException {
		if(balance <= 0) {
			throw new MyException("Deposit amount cannot be negative");
		}
		this.balance = balance;
	}
	
	public void deposite(double amount) throws MyException {
		if(amount <= 0) {
			throw new MyException("Deposit amount cannot be negative");
		}
		this.balance += amount;
	}

	public void withdraw(double amount) throws MyException{
		if(balance <= 0) {
			throw new MyException("Insufficient amount");
		}
		if(amount > balance) {
			throw new MyException("withdrawable amount is more then the current ammount");
		}
		this.balance -= amount;
	}
}