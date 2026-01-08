package com.Scenariobased.loanbuddy;

abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; // months
    protected double interestRate;
    private String loanStatus; // restricted access

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    // EMI formula: P × R × (1+R)^N / ((1+R)^N – 1)
    protected double emiFormula(double principal, double rate, int months) {
        double r = rate / (12 * 100);
        return (principal * r * Math.pow(1 + r, months)) /
               (Math.pow(1 + r, months) - 1);
    }
}
