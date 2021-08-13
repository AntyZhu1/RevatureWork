package com.Day4;

import java.util.ArrayList;

public class ArrayListSearchElement {
    public static void main(String[] args) {
        ArrayList<String> element=new ArrayList<>();

        element.add("element1");
        element.add("element2");
        element.add("element3");
        element.add("element4");
        System.out.println(element);


        System.out.println(element.indexOf("element4"));

        System.out.println(element.indexOf("element1"));

    }
}
