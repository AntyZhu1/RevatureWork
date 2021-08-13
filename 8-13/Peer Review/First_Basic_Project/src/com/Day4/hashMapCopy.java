package com.Day4;

import java.util.HashMap;

public class hashMapCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Mahi");
        map.put(2,"Md");
        map.put(3,"Shihab");
        map.put(4,"Rafa");
        map.put(5,"Ema");

        System.out.println("Original one : "+map);
        HashMap<Integer,String> mapCopy=new HashMap<>();

        mapCopy.putAll(map);
        System.out.println("Copy from the 1st one :"+mapCopy);




    }
}
