package com.Scenariobased.loanbuddy;

class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 12.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 720 && applicant.getIncome() >= 30000) {
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
