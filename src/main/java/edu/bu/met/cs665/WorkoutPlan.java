/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: WorkoutPlan.java
 * Description: This class represents a workout plan including a list of exercises and their details.
 */
package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class WorkoutPlan {

    private List<String> exercises = new ArrayList<>();
    private int totalSets;
    private int estimatedDurationMinutes;
    private String focus;

    public List<String> getExercises() {
        return exercises;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
    }

    public int getTotalSets() {
        return totalSets;
    }

    public void setTotalSets(int totalSets) {
        this.totalSets = totalSets;
    }

    public int getEstimatedDurationMinutes() {
        return estimatedDurationMinutes;
    }

    public void setEstimatedDurationMinutes(int estimatedDurationMinutes) {
        this.estimatedDurationMinutes = estimatedDurationMinutes;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }
}
