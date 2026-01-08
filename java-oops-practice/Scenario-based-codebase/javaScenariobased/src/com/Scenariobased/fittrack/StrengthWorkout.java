package com.Scenariobased.fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
    }

    @Override
    protected int calculateCalories() {
        return duration * 5; // Strength burns fewer calories
    }
}
