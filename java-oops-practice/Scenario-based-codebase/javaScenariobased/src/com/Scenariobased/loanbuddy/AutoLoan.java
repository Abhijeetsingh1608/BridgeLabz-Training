package com.Scenariobased.loanbuddy;

class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 9.0); // Auto loan interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000) {
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
