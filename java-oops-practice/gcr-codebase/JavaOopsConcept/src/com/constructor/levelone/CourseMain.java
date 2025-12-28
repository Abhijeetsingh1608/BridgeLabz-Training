package com.constructor.levelone;

public class CourseMain {
	public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Analytics", 4, 40000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("Technocrats");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }

}
