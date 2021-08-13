package com.Day2;

abstract class Shape{
    public double width;
    public double height;
    public double radius;
    public float pie=3.14f;

    public abstract void  getArea();
}

class Rectangle extends Shape{

    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    public void draw(){
        System.out.println("Rectangle drawing.........");
    }
    @Override
    public void getArea() {
        System.out.println(width*height);
    }
}

class Circle extends Shape{

    public Circle(double radius){
        this.radius=radius;
    }
    public void draw(){
        System.out.println("Circle drawing.......");
    }
    @Override
    public void getArea() {
        System.out.println(pie*radius*radius);
    }
}

public class Demo16 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(25,2);
        Circle circle=new Circle(55.55);
        rectangle.draw();
        circle.draw();

        rectangle.getArea();
        circle.getArea();


    }
}
