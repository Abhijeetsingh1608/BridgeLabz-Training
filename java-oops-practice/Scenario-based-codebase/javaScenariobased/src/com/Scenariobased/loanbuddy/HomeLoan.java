package com.Scenariobased.loanbuddy;

class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 7.5); // Home loan interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(applicant.getLoanAmount(), interestRate, term);
    }
}
