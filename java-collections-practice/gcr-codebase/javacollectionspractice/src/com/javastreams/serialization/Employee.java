package com.javastreams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Dept: " + department +
            ", Salary: " + salary
        );
    }
}
