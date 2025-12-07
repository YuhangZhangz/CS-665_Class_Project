/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: DailyPlanBuilder.java
 * Description: This interface defines the methods for building a daily fitness plan.
 */
package edu.bu.met.cs665;

public interface DailyPlanBuilder {
    void reset();
    void buildWorkout();
    void buildMeals();
    DailyFitnessPlan getResult();
}
