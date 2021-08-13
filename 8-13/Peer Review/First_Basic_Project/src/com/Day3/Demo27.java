package com.Day3;

public class Demo27 {
    public static void main(String[] args) {
       try {
           print();
       }catch (StackOverflowError s){
           System.out.println(s.getMessage());
       }
    }

    private static void print() {
        print1();
    }

    private static void print1() {
        print();
    }
}
