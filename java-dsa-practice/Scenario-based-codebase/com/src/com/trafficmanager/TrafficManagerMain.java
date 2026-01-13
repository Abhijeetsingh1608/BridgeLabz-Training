package com.trafficmanager;

public class TrafficManagerMain{

    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        EntryQueue entryQueue = new EntryQueue();

        Vehicle v1 = new Vehicle("KA-01");
        Vehicle v2 = new Vehicle("KA-02");
        Vehicle v3 = new Vehicle("KA-03");
        Vehicle v4 = new Vehicle("KA-04");

        entryQueue.enqueue(v1);
        entryQueue.enqueue(v2);
        entryQueue.enqueue(v3);
        entryQueue.enqueue(v4); // overflow

        while (!entryQueue.isEmpty()) {
            roundabout.addVehicle(entryQueue.dequeue());
        }

        roundabout.display();

        roundabout.removeVehicle("KA-02");
        roundabout.display();
    }
}
