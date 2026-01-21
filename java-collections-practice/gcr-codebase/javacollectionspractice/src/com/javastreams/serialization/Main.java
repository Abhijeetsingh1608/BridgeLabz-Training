package com.javastreams.serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Abhijeet", "IT", 50000));
        employees.add(new Employee(2, "Rahul", "HR", 40000));
        employees.add(new Employee(3, "Neha", "Finance", 45000));

        String fileName = "employees.dat";

        // Serialize
        EmployeeService.saveEmployees(employees, fileName);

        // Deserialize
        List<Employee> loadedEmployees =
                EmployeeService.loadEmployees(fileName);

        System.out.println("\nRetrieved Employees:");
        if (loadedEmployees != null) {
            for (Employee e : loadedEmployees) {
                e.display();
            }
        }
    }
}

