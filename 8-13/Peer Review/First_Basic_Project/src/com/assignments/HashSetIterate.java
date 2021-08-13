package com.assignments;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("MAhi");
        names.add("ema");
        names.add("rafa");

        Iterator iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
