package com.Day4;

import java.util.ArrayList;

public class ArrayListInsertFirst {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Mahi");
        names.add("md");
        names.add("rafa");
        names.add("Ema");

        for (String s:names){
            System.out.println(s);
        }

        names.add(0,"TopName");
        System.out.println(names);


    }
}
