package com.Day6;
interface ICar{
    void getCarModel();
    void getCarColor();

}
class Audi implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("Audi A6");
    }

    @Override
    public void getCarColor() {
        System.out.println("Black");
    }
}
class BMW implements ICar{

    @Override
    public void getCarModel() {
        System.out.println(" BMW X6");
    }

    @Override
    public void getCarColor() {
        System.out.println("Blue");
    }
}
class CarFactory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Audi();
            case 2:
                return new BMW();
            default:
                return null;
        }
    }
}

public class Demo6 {
    public static void main(String[] args) {
        ICar car1=CarFactory.getCarInstance(2);

        car1.getCarModel();
        car1.getCarColor();

    }
}
