package com.robowarehouse;

class Shelf {

    Package[] packages;
    int size;

    Shelf(int capacity) {
        packages = new Package[capacity];
        size = 0;
    }

    // Add package and keep shelf sorted
    void addPackage(Package newPackage) {
        int i = size - 1;

        // Shift heavier packages to right
        while (i >= 0 && packages[i].weight > newPackage.weight) {
            packages[i + 1] = packages[i];
            i--;
        }

        // Insert at correct position
        packages[i + 1] = newPackage;
        size++;
    }

    void displayShelf() {
        System.out.print("Shelf Order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(packages[i].weight + " ");
        }
        System.out.println();
    }
}
