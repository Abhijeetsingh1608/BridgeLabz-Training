package com.robowarehouse;

public class RoboWarehouseMain{

    public static void main(String[] args) {

        Shelf shelf = new Shelf(10);

        shelf.addPackage(new Package(20));
        shelf.addPackage(new Package(10));
        shelf.addPackage(new Package(30));
        shelf.addPackage(new Package(25));

        shelf.displayShelf();
    }
}
