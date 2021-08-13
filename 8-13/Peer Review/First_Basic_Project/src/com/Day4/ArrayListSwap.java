package com.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("Yellow");
        color.add("Green");
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("White");
        color.add("Ash");
        color.add("Deep Blue");


        System.out.println("Before swapping-----------");
        for (String a:color){
            System.out.println(a);
        }
        Collections.swap(color,0,1);
        System.out.println("After swapping-----------");
        for (String a:color){
            System.out.println(a);
        }


    }
}
