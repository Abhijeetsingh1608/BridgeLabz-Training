package com.Scenariobased.fittrack;

 class UserProfile {
	
		    private String name;
		    private int age;
		    private double weight;   // protected health data
		    private String goal;
		    private int dailyCalorieTarget;

		    // Default constructor
		    public UserProfile() {
		        this.goal = "Maintain Fitness";
		        this.dailyCalorieTarget = 2000;
		    }

		    // Parameterized constructor
		    public UserProfile(String name, int age, double weight, String goal) {
		        this.name = name;
		        this.age = age;
		        this.weight = weight;
		        this.goal = goal;
		        this.dailyCalorieTarget = calculateDailyTarget();
		    }

		    // Encapsulation (getter & setter)
		    public double getWeight() {
		        return weight;
		    }

		    public void setWeight(double weight) {
		        if (weight > 0) {
		            this.weight = weight;
		        }
		    }

		    private int calculateDailyTarget() {
		        return (int) (weight * 30); // simple calorie formula
		    }

		    public int getDailyCalorieTarget() {
		        return dailyCalorieTarget;
		    }
		}



