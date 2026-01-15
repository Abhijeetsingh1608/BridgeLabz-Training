package com.parceltracker;

public class ParcelTracker {

    Node head;

    // Add stage at end (Packed → Shipped → Delivered)
    public void addStage(String stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {
        Node temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Checkpoint not added.");
            return;
        }

        Node newNode = new Node(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost or missing (null pointer)");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
