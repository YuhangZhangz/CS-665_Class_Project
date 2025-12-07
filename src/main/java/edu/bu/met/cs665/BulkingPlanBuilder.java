/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: BulkingPlanBuilder.java
 * Description: This class implements the DailyPlanBuilder interface to create a bulking-level daily fitness plan.
 */
package edu.bu.met.cs665;

public class BulkingPlanBuilder implements DailyPlanBuilder {

    private DailyFitnessPlan plan;

    public BulkingPlanBuilder() {
        reset();
    }

    @Override
    public void reset() {
        plan = new DailyFitnessPlan();
        plan.setGoal("Bulking");
    }

    @Override
    public void buildWorkout() {
        WorkoutPlan workout = new WorkoutPlan();
        workout.addExercise("Barbell Bench Press");
        workout.addExercise("Deadlift");
        workout.addExercise("Squat");
        workout.setTotalSets(15);
        workout.setEstimatedDurationMinutes(70);
        workout.setFocus("Strength & Muscle Gain");
        plan.setWorkoutPlan(workout);
    }

    @Override
    public void buildMeals() {
        MealPlan meals = new MealPlan();
        meals.addMeal("Beef Rice Bowl");
        meals.addMeal("Pasta with Chicken");
        meals.setTotalCalories(3500);
        plan.setMealPlan(meals);
    }

    @Override
    public DailyFitnessPlan getResult() {
        return plan;
    }
}
