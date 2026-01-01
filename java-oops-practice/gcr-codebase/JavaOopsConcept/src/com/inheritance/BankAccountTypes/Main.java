package com.inheritance.BankAccountTypes;

public class Main {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA202", 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 100000, 24);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}