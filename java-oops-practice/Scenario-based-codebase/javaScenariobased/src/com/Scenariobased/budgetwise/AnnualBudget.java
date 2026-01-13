package com.Scenariobased.budgetwise;

import java.util.Map;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("==== Annual Budget Summary ====");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Yearly Savings: " + calculateNetSavings());
    }
}
