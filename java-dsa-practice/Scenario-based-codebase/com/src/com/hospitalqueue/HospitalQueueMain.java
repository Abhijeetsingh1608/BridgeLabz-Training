package com.hospitalqueue;

class HospitalQueueMain {

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("P1", 4),
            new Patient("P2", 9),
            new Patient("P3", 2),
            new Patient("P4", 7)
        };

        System.out.println("Before Sorting:");
        HospitalQueue.display(patients);

        HospitalQueue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        HospitalQueue.display(patients);
    }
}
