package com.traincompanion;

class Train {

    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = newCompartment;
            return;
        }

        tail.next = newCompartment;
        newCompartment.prev = tail;
        tail = newCompartment;
    }

    // Remove a compartment by name
    void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println(name + " compartment removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Traverse forward
    void traverseForward() {
        Compartment temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    void traverseBackward() {
        Compartment temp = tail;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Display adjacent compartments
    void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                String prevName = (temp.prev != null) ? temp.prev.name : "None";
                String nextName = (temp.next != null) ? temp.next.name : "None";

                System.out.println("Previous: " + prevName);
                System.out.println("Current : " + temp.name);
                System.out.println("Next     : " + nextName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}
