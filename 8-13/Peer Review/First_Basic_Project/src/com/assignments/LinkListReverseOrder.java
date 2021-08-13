package com.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> student=new LinkedList<>();

        student.add("mahi");
        student.add("shihab");
        student.add("uddin");
        student.add("ema");
        student.add("rafa");
        student.add("uddin");

        System.out.println("Before Reverse : "+student);

        Iterator iterator=student.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }




    }
}
