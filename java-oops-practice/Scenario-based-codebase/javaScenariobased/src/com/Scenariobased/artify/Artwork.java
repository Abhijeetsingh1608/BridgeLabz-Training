package com.Scenariobased.artify;

public class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;

    // Encapsulation: protected licensing terms
    protected String licenseType;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview (overloading)
    public Artwork(String title, String artist, double price,
                   String licenseType, String previewLink) {
        this(title, artist, price, licenseType);
        System.out.println("Preview available at: " + previewLink);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price); // operator usage
            System.out.println(user.getName() + " purchased " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    @Override
    public void license() {
        System.out.println("Licensed under: " + licenseType);
    }
}
