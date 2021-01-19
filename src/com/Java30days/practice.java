package com.Java30days;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice {
     static Character[] ray = {'p', 'w', 'n'};

    public static void collectionMethods() {
        String [] fruits = {"apples", "lemons", "geese", "bacon", "youtube" };
        List<String> l1 = Arrays.asList(fruits);

        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
    }

    public static void copy(){
        List<Character> original = Arrays.asList(ray);
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);
        Collections.copy(listCopy, original);
        System.out.println(listCopy);
        System.out.println(original);
    }
}
