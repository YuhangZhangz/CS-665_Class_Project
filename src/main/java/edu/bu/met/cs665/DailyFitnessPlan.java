/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: DailyFitnessPlan.java
 * Description: This class represents a daily fitness plan including workout and meal plans along with the fitness goal.
 */
package edu.bu.met.cs665;

public class DailyFitnessPlan {

    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;
    private String goal;

    public WorkoutPlan getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(WorkoutPlan workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public MealPlan getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String summary() {
        return "Goal: " + goal +
                "\nWorkout: " + workoutPlan +
                "\nMeals: " + mealPlan;
    }
}
