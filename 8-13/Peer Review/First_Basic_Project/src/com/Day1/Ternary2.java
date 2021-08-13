package com.Day1;

public class Ternary2 {
    public static void main(String[] args) {

        int score = 70;

        String res = (score >= 75) ? "Pass" : "Fail";
        System.out.println(res);


        int num = 252;
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result);

    }
}
