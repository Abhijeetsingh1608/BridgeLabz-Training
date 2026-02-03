package com.schoolsystem;

class Student {
    int id;
    String name;
    int age;
    int marks;
    int rank;

    public Student(int id, String name, int age, int marks, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rank = rank;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
    public int getRank() { return rank; }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks + " | Rank: " + rank;
    }
}

