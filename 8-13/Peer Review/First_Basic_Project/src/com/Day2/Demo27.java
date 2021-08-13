package com.Day2;

interface DB{
    void connection();
    interface  MySql{

    }
    interface MogoDB{

    }
}
class MyApp implements DB.MogoDB,DB.MySql{

}
public class Demo27 {
    public static void main(String[] args) {

    }
}
