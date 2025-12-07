/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: CoachDirector.java
 * Description: This class directs the construction of daily fitness plans using a specified builder.
 */
package edu.bu.met.cs665;

public class CoachDirector {

    private DailyPlanBuilder builder;

    public CoachDirector(DailyPlanBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(DailyPlanBuilder builder) {
        this.builder = builder;
    }

    public DailyFitnessPlan createStandardDayPlan() {
        builder.reset();
        builder.buildWorkout();
        builder.buildMeals();
        return builder.getResult();
    }
}
