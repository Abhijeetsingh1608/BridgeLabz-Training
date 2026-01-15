package com.Scenariobased.birdsanctuary;

public class BirdSanctuaryMain {
    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();

        sanctuary.addBird(new Eagle("B101", "Golden Eagle"));
        sanctuary.addBird(new Duck("B102", "Donald"));
        sanctuary.addBird(new Penguin("B103", "Pingu"));
        sanctuary.addBird(new Kiwi("B104", "KiwiBird"));

        System.out.println("\n--- All Birds ---");
        sanctuary.displayAllBirds();

        System.out.println("\n--- Bird Behaviors ---");
        sanctuary.showBehaviors();

        System.out.println("\n--- Flyable Birds ---");
        sanctuary.displayFlyableBirds();

        System.out.println("\n--- Sanctuary Report ---");
        sanctuary.sanctuaryReport();

        System.out.println("\n--- Developer Info (Reflection) ---");
        sanctuary.showDeveloperInfo();
    }
}
