package com.Day1;

class A1{
    public void testA(){
        System.out.println("A");
    }
}
class B1 extends A1{
    public void testB(){
        System.out.println("B");
    }
}
class C1 extends  B1{
    public void testC(){
        System.out.println("C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C1 c=new C1();
        c.testA();
        c.testB();
        c.testC();
        System.out.println("-------------");
        B1 b=new B1();
        b.testA();
        b.testB();
        System.out.println("-------------");
        A1 a=new A1();
        a.testA();


    }


}
