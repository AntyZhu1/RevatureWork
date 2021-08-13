package com.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();

        names.add("mahi");
        names.add("hasan");
        names.add("rafa");
        names.add("shihab");
        names.add("md");
        names.add("uddin");
        names.add("ema");

        System.out.println("Getting value at a specified index: "+names.get(1));


        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
