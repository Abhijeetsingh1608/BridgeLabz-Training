package com.cropmonitor;

class CropMonitor {

    void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);

            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    int partition(SensorData[] data, int low, int high) {
        int pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot) {
                i++;

                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    void displayData(SensorData[] data) {
        for (SensorData d : data) {
            System.out.println("Time: " + d.timestamp + " Temp: " + d.temperature);
        }
    }
}

