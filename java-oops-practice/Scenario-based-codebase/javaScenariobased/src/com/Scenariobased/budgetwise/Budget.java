package com.Scenariobased.budgetwise;

import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Encapsulation: no direct expense editing
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String category : spent.keySet()) {
            if (spent.get(category) > categoryLimits.getOrDefault(category, Double.MAX_VALUE)) {
                System.out.println("Overspend in " + category);
            }
        }
    }
}
