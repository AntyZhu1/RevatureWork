package com.Day2;


interface I1{
    void print();
}
interface I2 extends I1{
    void print();
}

// this one way to implements
class TestI implements I2{

    @Override
    public void print() {

    }
}


interface I3{
    void print();
}

interface I4{
    void print();
}

// this another way to implements
class Test023 implements I3,I4{

    @Override
    public void print() {

    }
}
public class Demo21 {
    public static void main(String[] args) {

    }
}
