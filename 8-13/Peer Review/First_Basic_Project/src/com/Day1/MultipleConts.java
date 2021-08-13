package com.Day1;

class Calculator01{
    int a=20;
    int b=30;

    public Calculator01(){

        System.out.println("Parameter less constructor");
    }
    public Calculator01(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void addNum(){
        System.out.println(a+b);
    }
}
public class MultipleConts {
    public static void main(String[] args) {
        Calculator01 calculator=new Calculator01();
        calculator.addNum();
        Calculator01 calculator1=new Calculator01(100,200);
        calculator1.addNum();
    }
}
