package com.assignments;

import java.util.TreeSet;

public class TreeSetSpecificPosition {
    public static void main(String[] args) {
        TreeSet<String> color=new TreeSet<>();

        color.add("Green");
        color.add("Red");
        color.add("Black");
        System.out.println("First colors: "+color);

        TreeSet<String> color2=new TreeSet<>();


        color2.add("White");
        color2.add("Pink");
        System.out.println("Second colors: "+color2);

        color.addAll(color2);

        System.out.println("All Colors: "+color);






    }
}
