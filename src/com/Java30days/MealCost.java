package com.Java30days;

public class MealCost {
    public static double solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent / 100);
        double tax = meal_cost * (tax_percent / 100);
        double total = meal_cost + tip + tax;

        return total;
    }
}
