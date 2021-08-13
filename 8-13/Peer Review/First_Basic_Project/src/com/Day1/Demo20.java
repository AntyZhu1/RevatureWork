package com.Day1;

class Calculator{
    int a=20;
    int b=10;

    public Calculator(){
        System.out.println("No args cons");
    }
    public Calculator(int x,int y){
        this.a=x;
        this.b=y;
    }
    public void addNum(){
        System.out.println(a+b);
    }
}
public class Demo20 {
    public static void main(String[] args) {
        Calculator cal1=new Calculator();
        cal1.addNum();

        Calculator cal2=new Calculator(200,500);
        cal2.addNum();
    }
}
