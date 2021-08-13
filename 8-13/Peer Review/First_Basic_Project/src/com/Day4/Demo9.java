package com.Day4;

import java.util.HashSet;
import java.util.Iterator;

public class Demo9 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("mahi");
        set.add("Md");
        set.add("Rafa");
        set.add("Ema");
        // Set will not allow duplicate value
        set.add("Ema");


        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //remove
        set.remove("Mahi");
        System.out.println(set);


    }
}
