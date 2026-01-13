package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class EntryQueue {

    private Queue<Vehicle> queue = new LinkedList<>();
    private int capacity = 3;

    // Add vehicle to waiting queue
    public void enqueue(Vehicle vehicle) {

        if (queue.size() == capacity) {
            System.out.println("Queue Overflow! Vehicle waiting outside");
            return;
        }

        queue.add(vehicle);
        System.out.println(vehicle.number + " waiting to enter");
    }

    // Remove vehicle from queue
    public Vehicle dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return null;
        }

        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
