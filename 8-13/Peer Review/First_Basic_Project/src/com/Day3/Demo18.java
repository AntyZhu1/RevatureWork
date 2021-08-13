package com.Day3;

public class Demo18 {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        int c=0;

        try {
            c=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println(c);
    }
}
