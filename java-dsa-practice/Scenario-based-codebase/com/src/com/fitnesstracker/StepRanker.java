package com.fitnesstracker;

public class StepRanker {

    public static void bubbleSort(User[] users) {

        int n = users.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Descending order (highest steps first)
                if (users[j].getSteps() < users[j + 1].getSteps()) {

                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization for already sorted list
            if (!swapped)
                break;
        }
    }
}
