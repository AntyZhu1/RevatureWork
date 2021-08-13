package com.Day6;

// in proper Dependency management
//class Engine{
//    public Engine(String type){
//
//    }
//}
//
//class Tyre{
//    public Tyre(String type){
//
//    }
//}
//
//class Car{
//    Engine engine;
//    Tyre tyre;
//
//    public  Car(){
//        this.engine = new Engine();
//        this.tyre = new Tyre();
//    }
//}




class Engine{

}
class Tire{

}

class CarFactory2{
    public static void getInstance(int id){
        switch (id){
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
        }
    }
}
class Car{
    Engine engine;
    Tire tire;

    public Car(Engine engine,Tire tire){
        this.engine=engine;
        this.tire=tire;
    }
}

public class Demo7 {
    public static void main(String[] args) {

    }
}
