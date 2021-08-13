package com.Day2;

interface X{
    void print();
    interface Y{
        void display();
    }
}

// this is how we get nested interface
class Z implements X,X.Y{

    @Override
    public void print() {

        System.out.println("This is from interface print");
    }

    @Override
    public void display() {
        System.out.println("This is from nested interface display");


    }
}
public class Demo24 {
    public static void main(String[] args) {

        Z z=new Z();
        z.display();
        z.print();
    }
}
