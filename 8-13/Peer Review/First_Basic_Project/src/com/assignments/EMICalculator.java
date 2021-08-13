package com.assignments;

import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal, rate, year;

        System.out.println("Enter your principal: ");
        principal = input.nextDouble();

        System.out.println("Enter your rate: ");
        rate = input.nextDouble();

        System.out.println("Enter your year: ");
        year = input.nextDouble();

        rate = rate / (12 * 100);
        year = year * 12;

        double payment = (principal * rate * Math.pow(1 + rate, year)) / (Math.pow(1 + rate, year) - 1);

        System.out.println("Your payment is: " + payment);


    }
}
