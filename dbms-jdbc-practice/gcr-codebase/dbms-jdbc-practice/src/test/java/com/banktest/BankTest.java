package com.banktest;

import org.junit.Test;

import com.bank.Bank;
import com.bank.MyException;

import junit.framework.Assert;

public class BankTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test_Deposit_ValidAmount() throws MyException {
		Bank b1 = new Bank(5000);
		b1.deposite(2000);
		Assert.assertEquals(7000.0, b1.getBalance());
	}
	
	@Test(expected = MyException.class)
	public void Test_Deposit_NegativeAmount() throws MyException {
		Bank b1 = new Bank(5000);
		b1.deposite(-1500);
	}
	
	@Test
	public void Test_Withdraw_ValidAmount() throws MyException {
		Bank b1 = new Bank(5000);
		b1.withdraw(1500);
		Assert.assertEquals(3500.0, 3500.0);
	}

	@Test(expected = MyException.class)
	public void Test_Withdraw_InsufficientFunds() throws MyException {
		Bank b1 = new Bank(5000);
		b1.withdraw(5001);;
	}
}