package com.Day2;

class A1{
    public final void test(){
        System.out.println("A1 test");
    }
}
class B1 extends A1{
    public void test2(){
        // we can use final method but can't change the value
        test();
    }
}
public class Demo14 {
    public static void main(String[] args) {
        A1 a=new A1();
        a.test();
    }
}
