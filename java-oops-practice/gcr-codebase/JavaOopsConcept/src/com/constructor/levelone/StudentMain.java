package com.constructor.levelone;

public class StudentMain {
	public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Abhijeet", 8.5, "Computer Science");

        pg.displayDetails();
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }

}
