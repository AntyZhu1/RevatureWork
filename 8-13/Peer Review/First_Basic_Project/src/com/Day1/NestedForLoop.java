package com.Day1;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        for (int a=1;a<=5;a++){
            for (int b=5;b>=a;b--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
