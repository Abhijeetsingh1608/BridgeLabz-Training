package com.parceltracker;

public class Node {
    String stage;
    Node next;

    public Node(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
