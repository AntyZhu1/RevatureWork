package com.Day2;


interface Drawable{
    void draw();
    //default method can have body in interface
    default void print(){
        System.out.println("default method");
    }
}
class Cat implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing.......");
    }
}

public class Demo22 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.draw();
        cat.print();

    }
}
