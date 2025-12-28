package com.constructor.levelone;

public class Course {
	String courseName;
    int duration;      
    double fee;

    static String instituteName = "Technocrats Institute ";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println(
            "Institute: " + instituteName +
            ", Course: " + courseName +
            ", Duration: " + duration + " months" +
            ", Fee: ₹" + fee
        );
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}
