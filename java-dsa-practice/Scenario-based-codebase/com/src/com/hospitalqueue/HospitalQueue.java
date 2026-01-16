package com.hospitalqueue;

class HospitalQueue {

    // Bubble Sort by criticality (Descending)
    static void sortByCriticality(Patient[] patients) {

        for (int i = 0; i < patients.length - 1; i++) {
            for (int j = 0; j < patients.length - i - 1; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }
}
