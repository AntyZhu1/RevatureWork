package com.assignments;

import java.util.Scanner;

public class SimpleCalculatorApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Number: ");
        int first = input.nextInt();
        System.out.println("Enter your Second Number: ");
        int second = input.nextInt();
        System.out.println("1. Add\n2. Subtract\n3. Multiple\n4. Divide\n5. Exit");

        int option = 5;
        option = input.nextInt();

        switch (option) {
            case 1:
                double add = first + second;
                System.out.println(add);
                break;
            case 2:
                double sub = first - second;
                System.out.println(sub);
                break;
            case 3:
                double multi = first * second;
                System.out.println(multi);
                break;
            case 4:
                double div = first / second;
                System.out.println(div);
                break;
            case 5:

                System.out.println("Thank you for using Calculator app.");

        }


    }
}
