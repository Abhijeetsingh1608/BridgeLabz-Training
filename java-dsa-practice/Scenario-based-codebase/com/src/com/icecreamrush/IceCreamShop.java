package com.icecreamrush;

class IceCreamShop {

    void sortFlavors(Flavor[] flavors) {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Bubble up the flavor with higher sales
                if (flavors[j].sales < flavors[j + 1].sales) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    void displayFlavors(Flavor[] flavors) {
        System.out.println("Flavors sorted by popularity:");
        for (Flavor f : flavors) {
            System.out.println(f.name + " - " + f.sales + " sold");
        }
    }
}
