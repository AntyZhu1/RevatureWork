package com.Day4;

import java.util.ArrayList;

public class ArrayListSpecifiedIndex {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("mahi");
        names.add("rafa");
        names.add("Uddin");
        names.add("Shihab");
        names.add("Ali");

        System.out.println("Getting value at a specified index: "+names.get(4));
    }
}
