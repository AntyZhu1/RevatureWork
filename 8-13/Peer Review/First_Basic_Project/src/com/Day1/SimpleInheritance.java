package com.Day1;

class Parent01{
    public Parent01(){
        System.out.println("parent class");
    }
}
class Child01 extends Parent01{
    public Child01(){
        System.out.println("Child class");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Child01 child01=new Child01();
    }
}
