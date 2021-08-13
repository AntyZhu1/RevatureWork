package com.Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();

        names.add("Mahi");
        names.add("Rafa");
        names.add("Ema");

        System.out.println(names);

        // adding element at specified position

        names.add(0,"mark");
        System.out.println(names);
        // adding second list
        LinkedList<String> newNames= new LinkedList<>();
        newNames.add("Abbu");
        newNames.add("Ali");
        names.addAll(newNames);
        System.out.println(names);

        names.addAll(0,newNames);
        System.out.println(names);


        //add first
        names.addFirst("FirstName");
        System.out.println(names);

        //add last
        names.addLast("lastName");
        System.out.println(names);

        names.add("Mahi");
        names.add("Rafa");
        System.out.println(names);
        //remove
        names.removeLastOccurrence("Rafa");
        System.out.println(names);
        // reverse
        System.out.println("Original----------------");

        System.out.println(names);

        Iterator iterator=names.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
