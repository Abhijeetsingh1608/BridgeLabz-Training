package com.parceltracker;

public class ParcelTrackerMain {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        // Initial stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("Delivered");

        // Add custom intermediate checkpoint
        tracker.addCheckpoint("Shipped", "In Transit");

        // Forward tracking
        tracker.trackParcel();
    }
}
