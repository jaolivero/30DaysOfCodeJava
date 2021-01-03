package com.Java30days;

public class StringToInteger {
    public void convertStringToInt(String S) {
        try {
            int printlog = Integer.parseInt(S);
            System.out.println(printlog);
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }
}
