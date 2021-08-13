package com.Day7;
class Calculator2<T>{
    public boolean areEqual(T a,T b){
        if (a.equals(b))
            return true;
        else
            return false;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Calculator2<String> calculator=new Calculator2<>();
        calculator.areEqual("A","B");
        Calculator2<Integer> integerCalculator=new Calculator2<>();

        integerCalculator.areEqual(10,20);



    }
}
