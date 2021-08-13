package com.Day2;

abstract class Test01{
    public abstract void display();
}
abstract class Test02 extends Test01{
    public abstract void display();

}
abstract class Test03 extends Test02{
    public abstract void display();
}

class Output02 extends Test03{

    @Override
    public void display() {

    }
}
public class Demo18 {
    public static void main(String[] args) {

    }
}
