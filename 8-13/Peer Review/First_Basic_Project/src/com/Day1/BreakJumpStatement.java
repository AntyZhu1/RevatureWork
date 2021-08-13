package com.Day1;

public class BreakJumpStatement {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            if (i==5){
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }
    }
}
