package com.Day6;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee otherObj) {

        if (id>otherObj.id)
            return 1;
        else if (id<otherObj.id)
            return -1;
        else
            return 0;
    }
}
public class Demo3 {
    public static void main(String[] args) {

        ArrayList<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1,"mahi0",25));
        employee.add(new Employee(3,"b",15));
        employee.add(new Employee(10,"md",5));


        System.out.println("Before Sorting.......");
        for (Employee em: employee){
            System.out.println(em);
        }
        Collections.sort(employee);
        // reverse by id....
        Collections.reverse(employee);
        System.out.println("After Sorting.......");
        for (Employee em: employee){
            System.out.println(em);
        }


    }
}
