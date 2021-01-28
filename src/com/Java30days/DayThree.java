package com.Java30days;

import java.util.Scanner;

public class DayThree {
    private static final Scanner scanner = new Scanner(System.in);

    public  void conditional() {
        int n = scanner.nextInt();
        if(n % 2 == 1 || n > 5 && n < 21) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
