package com.Scenariobased.skillforge;

import java.util.*;

public class Course {

    private String title;
    private Instructor instructor;
    protected double rating;                // protected → encapsulated rating logic
    private List<String> modules;
    private final List<String> reviews;      // read-only reviews

    // Default constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.rating = 0.0;
    }

    // Custom module list constructor
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new ArrayList<>();
        this.rating = 0.0;
    }

    // Rating logic protected (Encapsulation)
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    // Read-only access to reviews
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void addReview(String review, double rating) {
        reviews.add(review);
        updateRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}
