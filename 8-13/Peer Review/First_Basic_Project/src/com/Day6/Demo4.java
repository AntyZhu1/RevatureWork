package com.Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollNum;
    String name;
    int age;

    public Student(int rollNum, String name, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// if we don't have access of the comparable for the parent class
// then can create our own compareTo methods.

class SortByRollNum implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.rollNum>s2.rollNum)
            return 1;
        else if (s1.rollNum<s2.rollNum)
            return -1;
        else
            return 0;
    }
}
 class SortByAge implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.age>s2.age)
            return 1;
        else if (s1.age<s2.age)
            return -1;
        else
            return 0;
    }
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        // String Class already have CompareTo object
        return s1.name.compareTo(s2.name);
    }
}

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student(101,"mahi",45));
        students.add(new Student(103,"rafa",1));
        students.add(new Student(102,"ema",25));

        System.out.println("Bedore sorting..............");
        for (Student st:students){
            System.out.println(st);
        }

        // sort by Age
      //  Collections.sort(students,new SortByAge());
        // sort by Name
       // Collections.sort(students,new SortByName());
        // sort by Roll number
        Collections.sort(students,new SortByRollNum());
        System.out.println("After sorting..............");
        for (Student st:students){
            System.out.println(st);
        }
    }
}
