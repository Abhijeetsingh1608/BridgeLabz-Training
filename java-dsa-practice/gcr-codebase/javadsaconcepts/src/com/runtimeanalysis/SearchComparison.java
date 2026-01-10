package com.runtimeanalysis;

import java.util.*;

public class SearchComparison {

    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 1_000_000; // Dataset size
        int[] data = new int[N];

        // Fill dataset
        for (int i = 0; i < N; i++) {
            data[i] = i + 1;
        }

        int target = N; // Worst case

        // Linear Search Timing
        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();
        long linearTime = endLinear - startLinear;

        // Binary Search (array already sorted)
        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();
        long binaryTime = endBinary - startBinary;

        // Output
        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
    }
}
