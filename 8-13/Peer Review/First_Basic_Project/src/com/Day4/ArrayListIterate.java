package com.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(25);
        numbers.add(65);
        numbers.add(85);
        numbers.add(45);
        numbers.add(15);

        Iterator<Integer> iterator=numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
