package com.Day4;

import java.util.HashMap;
import java.util.Map;

public class Demo16 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"mahi");
        map.put(2,"Rafa");
        map.put(3,"md");
        map.put(4,null);

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
