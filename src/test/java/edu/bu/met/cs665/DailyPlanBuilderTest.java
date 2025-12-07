/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: DailyPlanBuilderTest.java
 * Description: This class contains unit tests for the DailyPlanBuilder interface and its implementations.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;

public class DailyPlanBuilderTest {

    @Test
    public void testBuilderSwitching() {
        CoachDirector director = new CoachDirector(new BulkingPlanBuilder());
        DailyFitnessPlan bulk = director.createStandardDayPlan();
        assertEquals("Bulking", bulk.getGoal());

        director.setBuilder(new CuttingPlanBuilder());
        DailyFitnessPlan cut = director.createStandardDayPlan();
        assertEquals("Cutting", cut.getGoal());
    }
}
