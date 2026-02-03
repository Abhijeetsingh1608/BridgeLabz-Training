package com.schoolsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Amit", 20, 75, 2));
        students.add(new Student(2, "Neha", 17, 40, 5));
        students.add(new Student(3, "Rahul", 19, 85, 1));
        students.add(new Student(4, "Sneha", 18, 60, 3));
        students.add(new Student(5, "Ankit", 21, 35, 6));

        // 1️⃣ Lambda to print welcome message
        students.forEach(s ->
            System.out.println("Welcome " + s.getName())
        );

        // 2️⃣ Lambda to check pass or fail
        students.forEach(s -> {
            if (s.getMarks() >= 40)
                System.out.println(s.getName() + " : PASS");
            else
                System.out.println(s.getName() + " : FAIL");
        });

        // 3️⃣ Sort students by name using lambda
        students.sort((s1, s2) ->
            s1.getName().compareTo(s2.getName())
        );
        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // 4️⃣ Sort students by rank using lambda
        students.sort((s1, s2) ->
            Integer.compare(s1.getRank(), s2.getRank())
        );
        System.out.println("\nSorted by Rank:");
        students.forEach(System.out::println);

        // 5️⃣ Display students whose age > 18 using lambda
        System.out.println("\nStudents age above 18:");
        students.forEach(s -> {
            if (s.getAge() > 18)
                System.out.println(s);
        });
    }
}
