package com.Scenariobased.budgetwise;


import java.util.HashMap;
import java.util.Map;

public class BudgetWiseMain {

    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);

        Budget budget = new MonthlyBudget(20000, 15000, limits);

        budget.addTransaction(new Transaction(2000, "expense", "Food"));
        budget.addTransaction(new Transaction(4000, "expense", "Travel"));
        budget.addTransaction(new Transaction(1000, "expense", "Food"));

        budget.generateReport();
        budget.detectOverspend();
    }
}