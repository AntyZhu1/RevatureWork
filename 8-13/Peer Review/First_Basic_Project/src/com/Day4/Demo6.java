package com.Day4;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Md");
        names.add("shihab");
        names.add("Uddin");
        System.out.println(names);

        // getting element on a specified index

        System.out.println(names.get(2));
        // adding the element on a specific index
        names.add(2, "Noman");
        System.out.println(names);

        // merge two list

        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Hello");
        newNames.add("Hi");
        //names.addAll(newNames);
        System.out.println(names);

        // adding second list element to the specified position
        names.addAll(0,newNames);
        System.out.println(names);
        // remove
        names.remove(0);
        System.out.println(names);

        names.removeAll(newNames);
        System.out.println(names);

        // removing an element based on condition
        names.removeIf(name->name.contains("shihab"));
        System.out.println(names);


    }
}
