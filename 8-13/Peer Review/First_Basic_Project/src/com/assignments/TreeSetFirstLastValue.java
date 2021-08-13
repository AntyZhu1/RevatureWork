package com.assignments;

import java.util.TreeSet;

public class TreeSetFirstLastValue {
    public static void main(String[] args) {
        TreeSet<String> color = new TreeSet<>();


        color.add("Black");
        color.add("Blue");
        color.add("Pink");
        color.add("Green");
        // color.add("White");
        // color.add("Red");

        String first = color.first();
        String last = color.last();

        System.out.println(first);
        System.out.println(last);

    }
}
