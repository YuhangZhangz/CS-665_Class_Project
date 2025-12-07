/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: BulkingPlanTest.java
 * Description: This class contains unit tests for the BulkingPlanBuilder class.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;

public class BulkingPlanTest {

    @Test
    public void testBulkingPlanBuilder() {
        BulkingPlanBuilder builder = new BulkingPlanBuilder();
        builder.reset();
        builder.buildWorkout();
        builder.buildMeals();
        DailyFitnessPlan plan = builder.getResult();

        assertEquals("Bulking", plan.getGoal());
        assertNotNull(plan.getWorkoutPlan());
        assertNotNull(plan.getMealPlan());
    }
}
