package com.examcell;

class ExamCellMain {

    public static void main(String[] args) {

        // Combined scores from multiple centers
        Student[] students = {
            new Student("Amit", 85),
            new Student("Neha", 92),
            new Student("Ravi", 78),
            new Student("Pooja", 95),
            new Student("Karan", 88)
        };

        System.out.println("Before Sorting:");
        display(students);

        MergeSort.mergeSort(students, 0, students.length - 1);

        System.out.println("\nState-Level Rank List:");
        displayWithRank(students);
    }

    static void display(Student[] students) {
        for (Student s : students) {
            System.out.println(s.name + " - Score: " + s.score);
        }
    }

    static void displayWithRank(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Rank " + (i + 1) + ": " +
                               students[i].name +
                               " (Score: " + students[i].score + ")");
        }
    }
}
