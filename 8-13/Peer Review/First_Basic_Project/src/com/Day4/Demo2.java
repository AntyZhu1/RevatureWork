package com.Day4;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Mark");
        names.add("Noman");
        names.add("Simon");
        names.add("Md");
        names.add("Shihab");

        System.out.println(names.get(3));

        System.out.println("After changing the name");
        names.set(3,"Md Uddin");

        for (String name:names){
            System.out.println(name);
        }
    }
}
