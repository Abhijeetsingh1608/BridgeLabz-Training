package com.employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee(1, "Amit", 30, "Male", "Sales", 2016, 30000),
            new Employee(2, "Neha", 25, "Female", "HR", 2018, 25000),
            new Employee(3, "Ravi", 35, "Male", "IT", 2012, 60000),
            new Employee(4, "Priya", 28, "Female", "IT", 2019, 45000),
            new Employee(5, "Ankit", 32, "Male", "Sales", 2014, 28000),
            new Employee(6, "Sneha", 24, "Female", "Product", 2020, 40000),
            new Employee(7, "Rahul", 29, "Male", "Product", 2017, 50000)
        );

        // 1. Male & Female count
        System.out.println(
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getGender,
                    Collectors.counting()
                ))
        );

        // 2. Departments
        employees.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);

        // 3. Average age by gender
        System.out.println(
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getGender,
                    Collectors.averagingInt(Employee::getAge)
                ))
        );

        // 4. Highest paid employee
        Employee highestPaid =
            employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Highest Paid: " + highestPaid);

        // 5. Joined after 2015
        employees.stream()
            .filter(e -> e.getYearOfJoining() > 2015)
            .map(Employee::getName)
            .forEach(System.out::println);

        // 6. Count by department
        System.out.println(
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.counting()
                ))
        );

        // 7. Average salary by department
        System.out.println(
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                ))
        );

        // 8. Youngest male in Product
        Employee youngestMaleProduct =
            employees.stream()
                .filter(e -> e.getGender().equals("Male")
                          && e.getDepartment().equals("Product"))
                .min(Comparator.comparing(Employee::getAge))
                .get();
        System.out.println("Youngest Male (Product): " + youngestMaleProduct);

        // 9. Most experienced employee
        Employee mostExperienced =
            employees.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining))
                .get();
        System.out.println("Most Experienced: " + mostExperienced);

        // 10. First 5 highest paid employees
        employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}
