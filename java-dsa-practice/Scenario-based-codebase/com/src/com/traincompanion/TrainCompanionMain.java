package com.traincompanion;

public class TrainCompanionMain {
    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");
        train.addCompartment("Guard");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("AC");
        train.traverseForward();
    }
}