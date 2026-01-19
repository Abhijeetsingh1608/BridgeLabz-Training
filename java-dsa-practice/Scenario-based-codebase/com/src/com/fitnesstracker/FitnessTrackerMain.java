package com.fitnesstracker;

public class FitnessTrackerMain {
	public static void main(String[] args) {

        User[] users = {
            new User(1, "Amit", 6500),
            new User(2, "Neha", 8200),
            new User(3, "Ravi", 7800),
            new User(4, "Pooja", 9000),
            new User(5, "Karan", 8200)
        };

        StepRanker.bubbleSort(users);

        System.out.println("Daily Step Leaderboard:");

        int rank = 1;
        for (User u : users) {
            System.out.println("Rank " + rank + ": " + u);
            rank++;
        }
    }

}
