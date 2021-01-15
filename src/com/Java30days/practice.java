package com.Java30days;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice {

    public static void collectionMethods() {
        String [] fruits = {"apples", "lemons", "geese", "bacon", "youtube" };
        List<String> l1 = Arrays.asList(fruits);

        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
    }
}
