package com.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrayListShuffle {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mahi");
        names.add("md");
        names.add("rafa");
        names.add("Ema");

        System.out.println("Before Shuffling");
        Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.shuffle(names);
        System.out.println("After Shuffling "+names);



    }
}
