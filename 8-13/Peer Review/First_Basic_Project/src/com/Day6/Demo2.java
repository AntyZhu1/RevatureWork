package com.Day6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("mahi");

        names.add("ema");

        names.add("rafa");

        names.add("A");

        names.add("e");
        names.add("C");

        System.out.println("Before Sorting..............");
        for (String name:names){
            System.out.println(name);
        }
        Collections.sort(names);
        System.out.println("After Sorting..............");
        for (String name:names){
            System.out.println(name);
        }

    }
}
