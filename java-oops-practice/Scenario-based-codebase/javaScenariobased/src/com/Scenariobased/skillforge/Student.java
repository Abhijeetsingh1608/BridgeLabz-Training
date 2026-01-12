package com.Scenariobased.skillforge;

public class Student extends User implements ICertifiable {

    private int completedModules;
    private int totalModules;
    private String courseLevel;

    public Student(String name, String email, int totalModules, String courseLevel) {
        super(name, email);
        this.totalModules = totalModules;
        this.courseLevel = courseLevel;
        this.completedModules = 0;
    }

    // Operator usage for progress tracking
    public void completeModule() {
        completedModules++;   // ++ operator
    }

    public boolean hasCompletedCourse() {
        return completedModules >= totalModules;   // >= operator
    }

    // Polymorphism → certificate varies by course level
    @Override
    public String generateCertificate() {
        if (!hasCompletedCourse()) {
            return "Course not completed yet.";
        }

        if (courseLevel.equalsIgnoreCase("Beginner")) {
            return "🏅 Beginner Certificate awarded to " + name;
        } 
        else if (courseLevel.equalsIgnoreCase("Intermediate")) {
            return "🥈 Intermediate Certificate awarded to " + name;
        } 
        else {
            return "🥇 Advanced Certificate awarded to " + name;
        }
    }
}
