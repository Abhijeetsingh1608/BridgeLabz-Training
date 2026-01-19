package com.eduresults;

public class EduResultsMain {
	public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Amit", 85),
            new Student(2, "Neha", 92),
            new Student(3, "Ravi", 85),
            new Student(4, "Pooja", 78),
            new Student(5, "Karan", 92)
        };

        RankSorter.mergeSort(students, 0, students.length - 1);

        System.out.println("Final State Rank List:");

        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank + ": " + s);
            rank++;
        }
    }

}
