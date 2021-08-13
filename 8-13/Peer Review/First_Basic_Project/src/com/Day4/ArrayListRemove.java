package com.Day4;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<>();

        student.add("mahi");
        student.add("md");
        student.add("noman");
        student.add("Rafa");

        System.out.println(student);

        student.remove(2);
        System.out.println(student);
    }
}
