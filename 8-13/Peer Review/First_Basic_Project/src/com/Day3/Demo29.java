package com.Day3;

public class Demo29 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;

        try {
            c=a/b;
        }catch (ArithmeticException ex){

        }catch (NullPointerException | NumberFormatException ex1){

        }catch (Exception exx){

        }


    }
}
