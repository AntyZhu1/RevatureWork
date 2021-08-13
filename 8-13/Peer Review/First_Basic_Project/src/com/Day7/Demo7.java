package com.Day7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();

}
class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Rectangle drawing..");
    }
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle drawing..........");
    }
}
class Cone{
    void draw(){
        System.out.println("draw cone");
    }
}

class  Test{
    // creating a method that accepts only child class of shape class
    public static void drawShape(List<? extends Shape> list){
        for (Shape shape:list){
            shape.draw(); // calling method of shape class by child class instance
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {

        List<Rectangle> rectangleList=new ArrayList<>();
        List<Circle> circleList=new ArrayList<>();
        List<Cone> coneList=new ArrayList<>();

        Test.drawShape(rectangleList);
        Test.drawShape(circleList);
        // this class haven't extends Shape class
        //the error will occur
        //Test.drawShape(coneList);
    }
}
