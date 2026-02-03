package com.officesystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", 35000, 4));
        employees.add(new Employee(2, "Neha", 28000, 2));
        employees.add(new Employee(3, "Rahul", 50000, 6));
        employees.add(new Employee(4, "Sneha", 30000, 3));
        employees.add(new Employee(5, "Ankit", 45000, 5));

        // 1️⃣ Lambda to calculate employee bonus (salary > 30000)
        System.out.println("Employee Bonus Details:");
        employees.forEach(e -> {
            if (e.getSalary() > 30000) {
                double bonus = e.getSalary() * 0.10;
                System.out.println(e.getName() + " Bonus: " + bonus);
            }
        });

        // 2️⃣ Sort employees by salary using lambda
        employees.sort((e1, e2) ->
            Double.compare(e1.getSalary(), e2.getSalary())
        );
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);

        // 3️⃣ Lambda to check promotion eligibility (experience > 3)
        System.out.println("\nPromotion Eligibility:");
        employees.forEach(e -> {
            if (e.getExperience() > 3)
                System.out.println(e.getName() + " : Eligible");
            else
                System.out.println(e.getName() + " : Not Eligible");
        });

        // 4️⃣ Lambda to print employee details
        System.out.println("\nEmployee Details:");
        employees.forEach(e ->
            System.out.println(e)
        );

        // 5️⃣ Lambda to compare two employees’ salaries
        Employee e1 = employees.get(0);
        Employee e2 = employees.get(1);

        int result = ((Comparator<Employee>)
                (emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
                .compare(e1, e2);

        System.out.println("\nSalary Comparison:");
        if (result > 0)
            System.out.println(e1.getName() + " earns more than " + e2.getName());
        else if (result < 0)
            System.out.println(e2.getName() + " earns more than " + e1.getName());
        else
            System.out.println("Both earn same salary");
    }
}
