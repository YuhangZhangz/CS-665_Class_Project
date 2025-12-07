/**
 * Name: Yuhang_Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/07/2025
 * File Name: MealPlan.java
 * Description: This class represents a meal plan including a list of meals and their nutritional information.
 */
package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class MealPlan {

    private List<String> meals = new ArrayList<>();
    private int totalCalories;
    private int carbsGram;
    private int proteinGram;
    private int fatGram;

    public List<String> getMeals() {
        return meals;
    }

    public void addMeal(String meal) {
        meals.add(meal);
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getCarbsGram() {
        return carbsGram;
    }

    public void setCarbsGram(int carbsGram) {
        this.carbsGram = carbsGram;
    }

    public int getProteinGram() {
        return proteinGram;
    }

    public void setProteinGram(int proteinGram) {
        this.proteinGram = proteinGram;
    }

    public int getFatGram() {
        return fatGram;
    }

    public void setFatGram(int fatGram) {
        this.fatGram = fatGram;
    }
}
