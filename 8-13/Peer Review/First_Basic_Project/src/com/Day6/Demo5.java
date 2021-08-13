package com.Day6;
class Calculator{
    public static int count=0;

    private static Calculator instance=null;
    private Calculator(){
        count++;
        System.out.println("count "+count);
        System.out.println("Constructor called");


    }
    public static Calculator getInstance(){
        if (instance==null)
            instance=new Calculator();
        return instance;
    }

}
public class Demo5 {
    public static void main(String[] args) {
        Calculator calculator=Calculator.getInstance();
        Calculator calculator1=Calculator.getInstance();
        Calculator calculator2=Calculator.getInstance();
    }
}
