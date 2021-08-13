package com.Day4;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Md");
        names.add("Ali");
        names.add("Shihab");
        names.add("Uddin");

        for (String name:names){
            System.out.println(name);

        }

        System.out.println("ForEach Loop..........");
        names.forEach(name -> {
            System.out.println(name);
        });

    }
}
