package com.Java30days;

public class Factorial {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial(n -1);
        }
    }

}
