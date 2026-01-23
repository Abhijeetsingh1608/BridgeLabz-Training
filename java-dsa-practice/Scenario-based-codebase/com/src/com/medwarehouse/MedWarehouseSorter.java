package com.medwarehouse;

import java.util.*;

public class MedWarehouseSorter {

    public static void mergeSort(List<Medicine> medicines) {

        if (medicines.size() <= 1)
            return;

        int mid = medicines.size() / 2;

        List<Medicine> left =
                new ArrayList<>(medicines.subList(0, mid));
        List<Medicine> right =
                new ArrayList<>(medicines.subList(mid, medicines.size()));

        mergeSort(left);
        mergeSort(right);

        merge(medicines, left, right);
    }

    private static void merge(List<Medicine> result,
                              List<Medicine> left,
                              List<Medicine> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            // Stable merge: earlier expiry first
            if (left.get(i).getExpiryDays()
                    <= right.get(j).getExpiryDays()) {

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
