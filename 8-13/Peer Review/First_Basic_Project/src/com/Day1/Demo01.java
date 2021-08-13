package com.Day1;

public class Demo01 {
    static  int z=100; // static variable
    static int x=10; // instance variable

    public static void addNum(){
        // static keyword will not working in this variable
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public static void subNum(){
        int y=5;
        System.out.println(x-y);
    }
    public static void main(String[] args) {

        addNum();
        subNum();
    }
}
