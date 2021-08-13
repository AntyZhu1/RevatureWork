package com.Day2;

class Parent{
    public void greeting(String name){
        System.out.println("Welcome "+name);
    }

}
class Child extends Parent{
    public void greeting(String name){
        System.out.println("Hello "+name);
    }
}
public class Demo9 {
    public static void main(String[] args) {
        Child c=new Child();
        c.greeting("mahi");

    }
}
