package com.medwarehouse;

import java.util.*;

public class MedWarehouseMain{

    public static void main(String[] args) {

        List<Medicine> medicines = new ArrayList<>();

        // Branch-wise sorted data
        medicines.add(new Medicine("Paracetamol", "B101", 40));
        medicines.add(new Medicine("Aspirin", "A202", 60));
        medicines.add(new Medicine("Cough Syrup", "C303", 20));
        medicines.add(new Medicine("Vitamin C", "V404", 60));
        medicines.add(new Medicine("Antibiotic", "AB505", 10));

        System.out.println("Before Sorting:");
        medicines.forEach(System.out::println);

        MedWarehouseSorter.mergeSort(medicines);

        System.out.println("\nAfter Merge Sort (By Expiry):");
        medicines.forEach(System.out::println);

        System.out.println("\n⚠ Medicines Near Expiry (≤ 30 days):");
        for (Medicine m : medicines) {
            if (m.getExpiryDays() <= 30) {
                System.out.println(m);
            }
        }
    }
}
