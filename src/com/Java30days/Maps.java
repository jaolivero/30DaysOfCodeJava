package com.Java30days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> myMap = new HashMap<String,String>();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.containsKey(s)) {
                System.out.println(s + "=" + myMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

