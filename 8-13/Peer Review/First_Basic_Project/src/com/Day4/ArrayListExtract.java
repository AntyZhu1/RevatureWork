package com.Day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExtract {
    public static void main(String[] args) {
        List<String> color=new ArrayList<>();
        color.add("Yellow");
        color.add("Green");
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("White");
        color.add("Ash");
        color.add("Deep Blue");

        System.out.println(color);
        List<String> extract=color.subList(0,3);
        System.out.println("After extract: "+extract);



    }
}
