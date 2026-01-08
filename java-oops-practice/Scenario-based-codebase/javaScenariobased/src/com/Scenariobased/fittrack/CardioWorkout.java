package com.Scenariobased.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    @Override
    protected int calculateCalories() {
        return duration * 8; // Cardio burns more calories
    }
}