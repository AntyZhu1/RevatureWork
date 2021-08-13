package com.Day1;

class Car{
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Car(String name, String color, int price, String engineType) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }

    public Car(Car car){
        this.name = car.name;
        this.color = car.color;
        this.price = car.price;
        this.engineType = car.engineType;
    }
    public Car(Car car,int price){
        this.name = car.name;
        this.color = car.color;
        this.price = price;
        this.engineType = car.engineType;
    }

}
public class Demo21 {
    public static void main(String[] args) {

        Car car1=new Car("Audi","Black",300000,"gas");
        Car car2=new Car(car1);
        Car car3=new Car(car1,253000);



    }
}
