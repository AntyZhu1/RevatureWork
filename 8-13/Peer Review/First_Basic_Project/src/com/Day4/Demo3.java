package com.Day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();


        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        System.out.println("before Sorting........");
        for (String color:colors){
            System.out.println(color);
        }

        System.out.println("after Sorting........");
        Collections.sort(colors);
        for (String color:colors){
            System.out.println(color);
        }



        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(225);
        numbers.add(2);
        numbers.add(25);
        numbers.add(22);
        numbers.add(205);
        numbers.add(5);
        numbers.add(2250);
        System.out.println("before Sorting........");
        for (Integer number :numbers){
            System.out.println(number);
        }

        System.out.println("before Sorting........");
        Collections.sort(numbers);
        for (Integer number:numbers){
            System.out.println(number);
        }
    }
}
