package com.inheritance.AnimalHierarchy;

class Animal {
	String name;
	int age;
	
	void makeSound() {
		System.out.println("Animals make sound");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog make sound");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat make sound");
	}
}

class Bird extends Animal{
	void makeSound() {
		System.out.println("Bird make sound");
	}
}




