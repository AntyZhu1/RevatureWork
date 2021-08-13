package com.Day1;


public class StaticInstanceVariable {
    static int a = 100; // static variable
    int x = 10; // instance variable

    public void addNum() {
        int i = 10;
        int b = 20;
        System.out.println(i + b);
    }

    public void subNum() {
        int y = 5;
        System.out.println(x - y);
    }

    public static void main(String[] args) {

    }
}
