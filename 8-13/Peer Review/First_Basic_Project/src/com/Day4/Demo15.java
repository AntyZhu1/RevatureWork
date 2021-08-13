package com.Day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo15 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("Name","mahi");
        map.put("roll",100);
        map.put("Email","Hi@gami.com");


        Set set=map.entrySet();

        Iterator iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry= (Map.Entry) iterator.next();

            System.out.println(entry.getKey()+": "+entry.getValue());


        }




    }
}
