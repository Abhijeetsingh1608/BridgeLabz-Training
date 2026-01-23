package com.foodfest;

import java.util.*;

public class FoodFestSorter {

    public static void mergeSort(List<Stall> stalls) {
        if (stalls.size() <= 1) return;

        int mid = stalls.size() / 2;

        List<Stall> left = new ArrayList<>(stalls.subList(0, mid));
        List<Stall> right = new ArrayList<>(stalls.subList(mid, stalls.size()));

        mergeSort(left);
        mergeSort(right);

        merge(stalls, left, right);
    }

    private static void merge(List<Stall> result, List<Stall> left, List<Stall> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            // Stability: if equal, take from left list first
            if (left.get(i).getFootfall() <= right.get(j).getFootfall()) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}
