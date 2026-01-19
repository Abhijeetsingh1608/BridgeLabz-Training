package com.flashdealz;

public class QuickSorter {

    public static void quickSort(Product[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);   // left side
            quickSort(arr, pivotIndex + 1, high);  // right side
        }
    }

    private static int partition(Product[] arr, int low, int high) {

        Product pivot = arr[high];   // last element as pivot
        int i = low - 1;              // index of smaller element

        for (int j = low; j < high; j++) {

            // Descending order (high discount first)
            if (arr[j].getDiscount() >= pivot.getDiscount()) {

                i++;

                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // correct position of pivot
    }
}
