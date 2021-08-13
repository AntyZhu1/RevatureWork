package com.Day1;

class Parent {

    public Parent() {
        System.out.println("Parent cons called");
    }
}
    class Child extends Parent{
        public Child(){
            System.out.println("Child cons called");
        }
    }


public class Demo24 {
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println();
        Child c=new Child();
    }
}
