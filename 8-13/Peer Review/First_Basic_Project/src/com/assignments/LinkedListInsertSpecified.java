package com.assignments;

import java.util.LinkedList;

public class LinkedListInsertSpecified {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

        student.add("mahi");
        student.add("shihab");
        student.add("uddin");
        student.add("ema");
        student.add("rafa");
        student.add("uddin");

        System.out.println("Before changing value "+student);

        student.set(2,"Noman");
        System.out.println("After changing value "+student);



    }
}
