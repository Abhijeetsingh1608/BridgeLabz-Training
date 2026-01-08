package com.Scenariobased.loanbuddy;

public class LoanBuddyMain {
	public static void main(String[] args) {

        Applicant applicant =
                new Applicant("Abhijeet", 750, 50000, 500000);

        LoanApplication loan =
                new HomeLoan(applicant, 240); // Polymorphism

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected.");
        }

        System.out.println("Loan Status: " + loan.getLoanStatus());
    }

}
