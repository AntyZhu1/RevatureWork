package com.Day3;

public class Demo3 {
    public static void main(String[] args) {
        String s1="Mark";
        String s2="Mark";
        String s3=new String("Mark");
        String s4="Md";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        String s5="MARK";

        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
