package com.Day4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(25);
        num.add(5);
        num.add(2);
        num.add(254);
        num.add(245);
        num.add(125);
        num.add(925);
        num.add(225);
        System.out.println("Before Sorting---------------------");

        for (int a: num){
            System.out.println(a);
        }


        Collections.sort(num);
        System.out.println("After Sorting---------------------");

        for (int a: num){
            System.out.println(a);
        }

    }
}
