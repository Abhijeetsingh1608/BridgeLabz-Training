package com.Scenariobased.bagnballorganizer;
import java.util.*;

public class BagnBallOrganizerMain {
	public static void main(String[] args) {

        Bag bag1 = new Bag("B1", "Red", 2);
        Bag bag2 = new Bag("B2", "Blue", 3);

        Ball ball1 = new Ball("L1", "Yellow", "Small");
        Ball ball2 = new Ball("L2", "Green", "Medium");
        Ball ball3 = new Ball("L3", "Blue", "Large");

        // Add balls
        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // should fail (capacity full)

        bag2.addBall(ball3);

        // Display balls
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove ball
        bag1.removeBall("L1");

        bag1.displayBalls();

        // Display all bags and ball count
        List<Bag> bags = Arrays.asList(bag1, bag2);

        System.out.println("\n--- All Bags Summary ---");
        for (Bag b : bags) {
            System.out.println("Bag " + b.getId() + " has " + b.getBallCount() + " balls.");
        }
    }
}
