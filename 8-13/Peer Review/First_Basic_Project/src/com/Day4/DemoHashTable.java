package com.Day4;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "mahi");
        hashtable.put(2, "Rafa");
        hashtable.put(3, "Hello");

        // will not allow duplicate key
        hashtable.put(3, "Hello");


        // HashTable will not accept any null value
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
