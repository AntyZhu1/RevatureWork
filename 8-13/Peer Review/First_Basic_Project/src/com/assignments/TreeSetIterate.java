package com.assignments;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterate {
    public static void main(String[] args) {
        TreeSet<String> color=new TreeSet<>();

        color.add("Green");
        color.add("Red");
        color.add("Black");
        color.add("White");
        color.add("Pink");


        Iterator iterator= color.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
