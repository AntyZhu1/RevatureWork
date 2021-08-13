package com.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListIterate {
    public static void main(String[] args) {
        LinkedList<String> color=new LinkedList<>();

        color.add("Green");
        color.add("Red");
        color.add("Yellow");
        color.add("Pink");
        color.add("Blue");


        Iterator<String> iterator=color.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
