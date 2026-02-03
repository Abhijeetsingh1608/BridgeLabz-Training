package com.officesystem;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private int experience;

    public Employee(int id, String name, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return name + " | Salary: " + salary + " | Experience: " + experience + " years";
    }
}
