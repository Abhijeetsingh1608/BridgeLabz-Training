package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryByDepartment {

    static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 45000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "HR", 50000),
                new Employee("Eve", "Finance", 80000)
        );

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // Print result
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> Average Salary: " + avgSalary));
    }
}
