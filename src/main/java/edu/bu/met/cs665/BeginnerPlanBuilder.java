/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: BeginnerPlanBuilder.java
 * Description: This class implements the DailyPlanBuilder interface to create a beginner-level daily fitness plan.
 */
package edu.bu.met.cs665;

public class BeginnerPlanBuilder implements DailyPlanBuilder {

    private DailyFitnessPlan plan;

    public BeginnerPlanBuilder() {
        reset();
    }

    @Override
    public void reset() {
        plan = new DailyFitnessPlan();
        plan.setGoal("Beginner Plan");
    }

    @Override
    public void buildWorkout() {
        WorkoutPlan workout = new WorkoutPlan();
        workout.addExercise("Bodyweight Squats");
        workout.addExercise("Light Dumbbell Press");
        workout.setTotalSets(6);
        workout.setEstimatedDurationMinutes(30);
        workout.setFocus("Full Body");
        plan.setWorkoutPlan(workout);
    }

    @Override
    public void buildMeals() {
        MealPlan meals = new MealPlan();
        meals.addMeal("Oatmeal");
        meals.addMeal("Chicken Salad");
        meals.setTotalCalories(1800);
        plan.setMealPlan(meals);
    }

    @Override
    public DailyFitnessPlan getResult() {
        return plan;
    }
}
