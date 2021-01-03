package com.Java30days;

public class Main {

    public static void main(String[] args) {
//        MealCost.solve(12, 20, 8);
        System.out.println(solve(12,20,8));
    }

    public static boolean solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        System.out.println(tip);
        double tax = meal_cost * tax_percent / 100;
        System.out.println(tax);
        long total = Math.round(meal_cost + tip + tax);
        System.out.println(total);

        return true;
    }
}


