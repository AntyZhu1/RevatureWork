package com.Day4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo14 {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("Hello");
        deque.add("Hi");
        deque.add("Mahi");

        for (String name:deque){
            System.out.println(name);
        }

    }
}
