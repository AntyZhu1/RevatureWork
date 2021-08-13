package com.Day4;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Student student1=new Student(1,"md","m@gamil.com");
        Student student2=new Student(2,"shihab","s@gamil.com");

        Student student3=new Student(3,"Noman","n@gamil.com");

        Student student4=new Student(4,"Simon","s@gamil.com");

        ArrayList<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //Iterator
        Iterator iterator=students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("-----------------------------------------------------");
        //for each

        for (Student student:students){
            System.out.println(student);
        }


    }
}
