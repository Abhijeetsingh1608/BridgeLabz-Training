package com.Scenariobased.bagnballorganizer;

import java.util.*;

class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;

    // HAS-A relationship
    private List<Ball> balls = new ArrayList<>();

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getBallCount() {
        return balls.size();
    }

    // Add ball to bag
    public void addBall(Ball ball) {

        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is FULL. Cannot add ball " + ball.getId());
            return;
        }

        balls.add(ball);
        System.out.println("Ball " + ball.getId() + " added to Bag " + id);
    }

    // Remove ball from bag
    public void removeBall(String ballId) {

        Iterator<Ball> it = balls.iterator();

        while (it.hasNext()) {
            Ball b = it.next();
            if (b.getId().equals(ballId)) {
                it.remove();
                System.out.println("Ball " + ballId + " removed from Bag " + id);
                return;
            }
        }

        System.out.println("Ball " + ballId + " not found in Bag " + id);
    }

    // Display balls in bag
    public void displayBalls() {

        System.out.println("Balls in Bag " + id + ":");

        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }

        for (Ball b : balls) {
            System.out.println(b);
        }
    }
}
