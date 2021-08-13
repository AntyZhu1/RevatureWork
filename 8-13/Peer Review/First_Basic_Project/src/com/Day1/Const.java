package com.Day1;

class Test01{
    int counter;

    public Test01(int counter) {
        this.counter = counter;
        System.out.println(this.counter);
    }
}
public class Const {
    public static void main(String[] args) {
        Test01 test=new Test01(20);
    }
}
