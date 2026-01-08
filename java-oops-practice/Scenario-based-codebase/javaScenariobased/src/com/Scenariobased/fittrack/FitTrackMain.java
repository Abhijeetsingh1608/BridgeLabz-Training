package com.Scenariobased.fittrack;

public class FitTrackMain {
	public static void main(String[] args) {

        UserProfile user = new UserProfile("Abhijeet", 22, 70, "Weight Loss");

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        cardio.stopWorkout();

        strength.startWorkout();
        strength.stopWorkout();

        int totalCaloriesBurned =
                cardio.getCaloriesBurned() + strength.getCaloriesBurned();

        int remainingCalories =
                user.getDailyCalorieTarget() - totalCaloriesBurned;

        System.out.println("Daily Target: " + user.getDailyCalorieTarget());
        System.out.println("Total Calories Burned: " + totalCaloriesBurned);
        System.out.println("Remaining Calories: " + remainingCalories);
    }

}
