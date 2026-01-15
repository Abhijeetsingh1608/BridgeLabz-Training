package com.Scenariobased.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims swiftly underwater.");
    }
}
