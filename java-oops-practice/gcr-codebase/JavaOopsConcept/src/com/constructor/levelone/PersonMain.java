package com.constructor.levelone;

public class PersonMain {
	public static void main(String[] args) {
        Person p1 = new Person("Amit", 25);
        Person p2 = new Person(p1);   // copy constructor

        p1.display();
        p2.display();
    }

}
