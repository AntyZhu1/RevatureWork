package com.Day4;

import java.util.Hashtable;
import java.util.Map;

public class Demo17 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();

        hashtable.put(1,"Mahi");
        hashtable.put(2,"rafa");
        hashtable.put(3,"Ema");


        for (Map.Entry entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


}
