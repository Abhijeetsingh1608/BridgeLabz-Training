package com.foodfest;

import java.util.*;

public class FoodFestMain {

    public static void main(String[] args) {

        List<Stall> stalls = new ArrayList<>();

        stalls.add(new Stall("Pizza Hub", 120));
        stalls.add(new Stall("Burger Point", 200));
        stalls.add(new Stall("Momo Corner", 150));
        stalls.add(new Stall("Ice Cream", 200));
        stalls.add(new Stall("Pasta House", 90));

        System.out.println("Before Sorting:");
        for (Stall s : stalls) {
            System.out.println(s);
        }

        FoodFestSorter.mergeSort(stalls);

        System.out.println("\nAfter Merge Sort (by Footfall):");
        for (Stall s : stalls) {
            System.out.println(s);
        }
    }
}
