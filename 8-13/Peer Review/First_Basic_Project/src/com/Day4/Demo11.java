package com.Day4;

import java.util.TreeSet;

public class Demo11 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("md");
        treeSet.add("Shihab");
        treeSet.add("Uddin");

        for (String name:treeSet){
            System.out.println(name);
        }
    }
}
