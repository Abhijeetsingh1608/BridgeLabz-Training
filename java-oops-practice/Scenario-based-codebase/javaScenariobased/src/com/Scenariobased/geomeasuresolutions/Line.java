package com.Scenariobased.geomeasuresolutions;

class Line {

    // private = encapsulation (data hidden)
    private double x1, y1, x2, y2;

    // Constructor to initialize object
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;   // this refers to current object
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of line
    public double calculateLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
