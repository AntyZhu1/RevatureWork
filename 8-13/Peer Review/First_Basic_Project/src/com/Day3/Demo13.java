package com.Day3;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Hello");
        System.out.println(sb.capacity());

        sb.append("This is a big string here, and also very very helpful");
        System.out.println(sb.capacity());




    }
}
