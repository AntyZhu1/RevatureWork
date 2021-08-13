package com.Day2;

abstract class Test10{
    public abstract void display();
}
abstract class Test20 extends Test10{
    public abstract void display2();
}
abstract class Test30 extends Test20{
    public abstract void display3();
}
class Output extends Test30{

    @Override
    public void display3() {

    }

    @Override
    public void display() {

    }

    @Override
    public void display2() {

    }
}
public class Demo17 {
    public static void main(String[] args) {

    }
}
