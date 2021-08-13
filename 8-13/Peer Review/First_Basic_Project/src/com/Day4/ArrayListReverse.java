package com.Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListReverse {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Mahi");
        names.add("md");
        names.add("rafa");
        names.add("Ema");


        System.out.println("Original--------------- "+names);

        Iterator<String> iterator=names.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
