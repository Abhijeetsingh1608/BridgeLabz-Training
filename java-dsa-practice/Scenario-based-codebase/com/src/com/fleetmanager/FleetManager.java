package com.fleetmanager;

class FleetManager {

    Vehicle[] mergeSort(Vehicle[] vehicles) {
        if (vehicles.length <= 1)
            return vehicles;

        int mid = vehicles.length / 2;

        Vehicle[] left = new Vehicle[mid];
        Vehicle[] right = new Vehicle[vehicles.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = vehicles[i];

        for (int i = mid; i < vehicles.length; i++)
            right[i - mid] = vehicles[i];

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    Vehicle[] merge(Vehicle[] left, Vehicle[] right) {
        Vehicle[] result = new Vehicle[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].mileage <= right[j].mileage)
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];

        return result;
    }

    void displaySchedule(Vehicle[] vehicles) {
        System.out.println("Master Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleID + " - " + v.mileage + " km");
        }
    }
}
