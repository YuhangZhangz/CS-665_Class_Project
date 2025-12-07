/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: CuttingPlanBuilder.java
 * Description: This class implements the DailyPlanBuilder interface to create a cutting-level daily fitness plan.
 */
package edu.bu.met.cs665;

public class CuttingPlanBuilder implements DailyPlanBuilder {

    private DailyFitnessPlan plan;

    public CuttingPlanBuilder() {
        reset();
    }

    @Override
    public void reset() {
        plan = new DailyFitnessPlan();
        plan.setGoal("Cutting");
    }

    @Override
    public void buildWorkout() {
        WorkoutPlan workout = new WorkoutPlan();
        workout.addExercise("HIIT Cardio");
        workout.addExercise("Light Weight Circuit");
        workout.setTotalSets(10);
        workout.setEstimatedDurationMinutes(45);
        workout.setFocus("Fat Loss");
        plan.setWorkoutPlan(workout);
    }

    @Override
    public void buildMeals() {
        MealPlan m = new MealPlan();
        m.addMeal("Egg Whites");
        m.addMeal("Salmon & Veggies");
        m.setTotalCalories(1600);
        plan.setMealPlan(m);
    }

    @Override
    public DailyFitnessPlan getResult() {
        return plan;
    }
}
