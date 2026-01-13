package com.trafficmanager;

public class Roundabout {

    private Vehicle head = null;

    // Add vehicle into circular path
    public void addVehicle(Vehicle newVehicle) {

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
            return;
        }

        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newVehicle;
        newVehicle.next = head;
    }

    // Remove vehicle by number
    public void removeVehicle(String number) {

        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.number.equals(number)) {

                if (curr == head) {
                    Vehicle last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(number + " exited roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // Print roundabout state
    public void display() {

        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(BACK TO START)");
    }
}
