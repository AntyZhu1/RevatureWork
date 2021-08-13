package com.Day6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(5);
        nums.add(285);
        nums.add(2);
        nums.add(205);
        nums.add(25);
        nums.add(125);
        nums.add(253);

        System.out.println("Before sorting...");
        for (int num:nums){
            System.out.println(num);
        }
        Collections.sort(nums);

        System.out.println("After sorting...");
        for (int num:nums){
            System.out.println(num);
        }
    }
}
