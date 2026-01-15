package com.Scenariobased.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies at low altitude.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims gracefully.");
    }
}
