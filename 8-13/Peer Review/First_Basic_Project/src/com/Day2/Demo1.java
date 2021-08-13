package com.Day2;

class Student{
    public int rollNum;
    public String name;
    static public String schoolName="ABC School";

    public void print(){
        System.out.println("RollNumber "+rollNum+", name "+name+", SchoolName "+schoolName);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Student st=new Student();
        st.rollNum=01;
        st.name="md";
        st.print();
        Student st2=new Student();
        st2.rollNum=02;
        st2.name="shihab";
        st2.print();
    }
}
