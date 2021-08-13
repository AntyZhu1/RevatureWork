package com.Day2;

interface Drawable2{
    void draw();

    // can have body
    static void area(){
        System.out.println("static method");
    }
}
class Circle2 implements Drawable2{

    @Override
    public void draw() {

        System.out.println("Drawing.......");
    }
}
public class Demo23 {
    public static void main(String[] args) {
        Circle2 circle2=new Circle2();
        circle2.draw();
        //to get the static method from the interface
        Drawable2.area();
    }
}
