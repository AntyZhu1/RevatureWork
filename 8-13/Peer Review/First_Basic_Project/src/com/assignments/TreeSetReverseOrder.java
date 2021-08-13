package com.assignments;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetReverseOrder {
    public static void main(String[] args) {
        TreeSet<String> color=new TreeSet<>();

        color.add("Green");
        color.add("Red");
        color.add("Black");

        System.out.println("Before reverse: "+color);
        Iterator iterator= color.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
