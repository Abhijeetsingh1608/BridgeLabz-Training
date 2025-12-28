package com.constructor.levelone;

public class Student {
	public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }
}
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }
    void displayDetails() {
        System.out.println(
            "Roll No: " + rollNumber +
            ", Name: " + name +
            ", CGPA: " + getCGPA() +
            ", Specialization: " + specialization
        );
    }
}
