package com.Day4;

import java.util.ArrayList;

public class ArrayListUpdateSpecific {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();

        cars.add("BMW");
        cars.add("Honda");
        cars.add("toyota");
        cars.add("Tesla");
        System.out.println(cars);
        // update value
        cars.set(1,"Honda Accord");
        System.out.println(cars);

    }
}
