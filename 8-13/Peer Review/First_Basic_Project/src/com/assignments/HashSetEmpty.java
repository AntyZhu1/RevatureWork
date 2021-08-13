package com.assignments;

import java.util.HashSet;

public class HashSetEmpty {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("MAhi");
        names.add("ema");
        names.add("rafa");

        System.out.println(names);

        names.removeAll(names);

        System.out.println("empty hashSet: "+names);
    }
}
