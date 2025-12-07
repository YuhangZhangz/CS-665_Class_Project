/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: DirectorTest.java
 * Description: This class contains unit tests for the CoachDirector class.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;

public class DirectorTest {

    @Test
    public void testDirectorCreatesPlan() {
        CoachDirector director = new CoachDirector(new BeginnerPlanBuilder());
        DailyFitnessPlan plan = director.createStandardDayPlan();

        assertEquals("Beginner Plan", plan.getGoal());
        assertNotNull(plan.getMealPlan());
        assertNotNull(plan.getWorkoutPlan());
    }
}
