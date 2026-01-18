package com.icecreamrush;

public class IceCreamRushMain {

    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Vanilla", 25),
            new Flavor("Chocolate", 40),
            new Flavor("Strawberry", 15),
            new Flavor("Mango", 30),
            new Flavor("Butterscotch", 10),
            new Flavor("Pista", 20),
            new Flavor("Blueberry", 5),
            new Flavor("KitKat", 35)
        };

        IceCreamShop shop = new IceCreamShop();

        shop.sortFlavors(flavors);
        shop.displayFlavors(flavors);
    }

}
