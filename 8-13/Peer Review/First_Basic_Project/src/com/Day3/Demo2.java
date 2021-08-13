package com.Day3;

public class Demo2 {
    public static void main(String[] args) {
        String str="Hello";
        str.concat("World");
        System.out.println(str);

        String str2="Hello ";       // we are using concat() method to append the string at the end
        str2=str2.concat("World");   // will print Hello only because strings are immutable object
        System.out.println(str2);






    }
}
