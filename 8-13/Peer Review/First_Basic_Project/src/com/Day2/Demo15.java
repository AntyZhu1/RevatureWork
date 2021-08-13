package com.Day2;

abstract class Calculator2{
    public void addNum(int num1,int num2){
        System.out.println("Sum: "+(num1+num2));
    }
    public void subNum(int num1,int num2){
        System.out.println("Sub: "+(num1-num2));
    }
    public abstract void mulNum(int num1,int num2);
    public abstract void divNum(int num1,int num2);
}
class Test2 extends Calculator2{

    @Override
    public void mulNum(int num1, int num2) {
        System.out.println("Mul: "+(num1*num2));
    }

    @Override
    public void divNum(int num1, int num2) {
        System.out.println("Div "+(num1/num2));
    }
}
public class Demo15 {
    public static void main(String[] args) {
        Test2 t1=new Test2();
        t1.addNum(20,25);
        t1.divNum(85,20);
        t1.mulNum(5,5);
        t1.divNum(25,5);

    }
}
