package com.gamezone;

import java.util.List;

public class LeaderboardSorter {

    public static void quickSort(List<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Player> players, int low, int high) {

        Player pivot = players.get(high); // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Descending order
            if (players.get(j).getScore() > pivot.getScore()) {
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }
}
