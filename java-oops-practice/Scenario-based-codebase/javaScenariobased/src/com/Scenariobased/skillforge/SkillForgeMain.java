package com.Scenariobased.skillforge;
import java.util.List;
public class SkillForgeMain {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Rahul Sharma", "rahul@skillforge.com");

        List<String> modules = List.of("Intro", "OOP", "Collections");
        Course course = new Course("Java Mastery", inst, modules);

        Student s1 = new Student("Abhijeet", "abhijeet@gmail.com", 3, "Advanced");

        s1.completeModule();
        s1.completeModule();
        s1.completeModule();

        System.out.println(s1.generateCertificate());
    }
}
