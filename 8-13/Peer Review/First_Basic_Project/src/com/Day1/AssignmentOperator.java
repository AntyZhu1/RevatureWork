package com.Day1;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("a "+a);
        System.out.println("b "+b);

        System.out.println(a++);
        System.out.println("post "+a);
        System.out.println("pre "+(++b));
        System.out.println(b);

        // increase the value of a
        a+=100;
        System.out.println(a);

    }
}
