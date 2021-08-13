package com.Day2;

class Calculator{
    // non static
    public void addNum(int num1,int num2){
        System.out.println(num1+num2);
    }
    //static
    public static void subNum(int num1,int num2){
        System.out.println(num1-num2);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.addNum(20,35);

        Calculator.subNum(80,20);
    }
}
