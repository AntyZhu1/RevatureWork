package com.Day1;

class Car01 {
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Car01(String name, String color, int price, String engineType) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }

    public Car01(Car01 car01) {
        this.name = car01.name;
        this.color = car01.color;
        this.price = car01.price;
        this.engineType = car01.engineType;
    }

    public Car01(Car01 car01, int price) {
        this.name = car01.name;
        this.color = car01.color;
        this.price = price;
        this.engineType = car01.engineType;
    }


    public void carInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Price: " + price + ", Engine Type: " + engineType);
    }
}

public class MultipleConts01 {
    public static void main(String[] args) {
        Car01 car = new Car01("Honda", "white", 5600, "Gas");
        Car01 car1 = new Car01(car); // copy from the car object
        Car01 car2 = new Car01(car1, 10000);
        car.carInfo();
        car1.carInfo();
        car2.carInfo();

    }
}
