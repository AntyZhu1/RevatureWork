package com.Day4;

import java.util.ArrayList;

public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mahi");
        names.add("md");
        names.add("rafa");
        names.add("Ema");

        ArrayList<String> copyNames=new ArrayList<>(names);
        System.out.println("Befor copy "+names);

        System.out.println("After copy "+copyNames);

    }
}
