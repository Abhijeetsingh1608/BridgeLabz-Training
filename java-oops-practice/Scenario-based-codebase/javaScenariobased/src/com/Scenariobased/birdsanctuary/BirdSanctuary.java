package com.Scenariobased.birdsanctuary;

import java.util.*;
import java.lang.reflect.*;

public class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();

    // Add bird
    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    // Display all birds
    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
            System.out.println(abilitiesOf(b));
        }
    }

    // Polymorphic behavior execution
    public void showBehaviors() {
        for (Bird b : birds) {
            b.eat();

            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    // Search birds by ability
    public void displayFlyableBirds() {
        birds.stream()
                .filter(b -> b instanceof Flyable)
                .forEach(b -> System.out.println(b.getName()));
    }

    public void displaySwimmableBirds() {
        birds.stream()
                .filter(b -> b instanceof Swimmable)
                .forEach(b -> System.out.println(b.getName()));
    }

    // Remove bird by ID
    public void removeBird(String id) {
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if ID existed.");
    }

    // Sanctuary Report
    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    // Reflection: Read annotation data
    public void showDeveloperInfo() {
        try {
            Class<?> cls = Bird.class;
            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
                System.out.println("Developer: " + info.name());
                System.out.println("Version: " + info.version());
                System.out.println("Description: " + info.description());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String abilitiesOf(Bird b) {
        boolean f = b instanceof Flyable;
        boolean s = b instanceof Swimmable;

        if (f && s) return " | Abilities: Fly & Swim";
        if (f) return " | Abilities: Fly";
        if (s) return " | Abilities: Swim";
        return " | Abilities: None";
    }
}
