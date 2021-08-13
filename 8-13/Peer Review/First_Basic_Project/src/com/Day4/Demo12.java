package com.Day4;

import java.util.TreeSet;

public class Demo12 {
    public static void main(String[] args) {
        TreeSet<Integer> num=new TreeSet<>();
        num.add(25);
        num.add(125);
        num.add(225);
        num.add(252);

        for(int i:num){
            System.out.println(i);
        }
        System.out.println("Highest: "+num.pollLast());
        System.out.println("Lowest: "+num.pollFirst());
    }
}
