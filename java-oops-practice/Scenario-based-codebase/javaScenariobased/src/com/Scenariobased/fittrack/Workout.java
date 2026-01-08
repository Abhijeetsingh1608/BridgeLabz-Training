package com.Scenariobased.fittrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // in minutes
    protected int caloriesBurned;

    protected abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println(type + " workout stopped. Calories burned: " + caloriesBurned);
    }
}