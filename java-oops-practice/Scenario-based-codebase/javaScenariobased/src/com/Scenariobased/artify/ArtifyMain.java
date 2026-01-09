package com.Scenariobased.artify;

public class ArtifyMain {

    public static void main(String[] args) {

        User buyer = new User("Abhijeet", 5000);

        Artwork digital = new DigitalArt(
                "Cyber Dreams",
                "Alex",
                1500,
                "Standard Digital License"
        );

        Artwork print = new PrintArt(
                "Vintage Sketch",
                "Maria",
                2000,
                "Print License"
        );

        // Polymorphism
        digital.purchase(buyer);
        digital.license();

        System.out.println("Wallet Balance: ₹" + buyer.getWalletBalance());
        System.out.println();

        print.purchase(buyer);
        print.license();

        System.out.println("Wallet Balance: ₹" + buyer.getWalletBalance());
    }
}
