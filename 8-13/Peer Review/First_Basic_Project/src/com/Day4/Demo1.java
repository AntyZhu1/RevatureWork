package com.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("md");
        arrayList.add("shihab");
        arrayList.add("uddin");
        System.out.println("ArrayList is " + arrayList);

        Iterator iterator = arrayList.iterator();
        System.out.println("Iterator printing ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("For Loop printing");
        for (String name : arrayList) {
            System.out.println(name);
        }

    }
}
