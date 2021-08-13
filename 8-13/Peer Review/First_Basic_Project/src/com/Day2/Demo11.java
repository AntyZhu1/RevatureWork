package com.Day2;
class Car{
    public final int sppedLimit=30;
    public void drive(){
        System.out.println("car speed is "+sppedLimit);
    }
}
public class Demo11 {
    public static void main(String[] args) {
        Car car=new Car();

        //can't change the value of "FINAL"speedLimit
        //car.sppedLimit=20;
        car.drive();
    }
}
