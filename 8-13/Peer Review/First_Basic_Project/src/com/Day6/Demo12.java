package com.Day6;

import java.util.ArrayList;
import java.util.Collections;

class Customer{
    public int id;
    public String name;
    public int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo12 {
    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<>();

        customers.add(new Customer(102,"Rafa",1));
        customers.add(new Customer(101,"Ema",16));
        customers.add(new Customer(103,"Mahi",31));

        System.out.println("Before Sorting...........");

        for (Customer customer:customers){
            System.out.println(customer);
        }


        Collections.sort(customers,(c1,c2)->{
            if (c1.age>c2.age)
                return 1;
            else if (c1.age<c2.age)
                return -1;
            else
                return Integer.parseInt(null);
        });

        //String have their own CompareTo, so we just need one statement for this.


        Collections.sort(customers,(c1,c2)->{
            return c1.name.compareTo(c2.name);
        });


        System.out.println("After Sorting...........");

        for (Customer customer:customers){
            System.out.println(customer);
        }

    }
}
