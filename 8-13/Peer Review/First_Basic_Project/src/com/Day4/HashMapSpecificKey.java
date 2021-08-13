package com.Day4;

import java.util.HashMap;
import java.util.Map;

public class HashMapSpecificKey {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Mahi");
        map.put(2,"Md");
        map.put(3,"Shihab");
        map.put(4,"Rafa");
        map.put(5,"Ema");

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
