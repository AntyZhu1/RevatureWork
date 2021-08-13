package com.Day1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 100;

        //If-else statement

        //without curly braces
        if (age > 18)
            System.out.println("You're Good");
        else
            System.out.println("You're not Good ");

        //with curly braces
        if (age >= 1) {
            System.out.println("You're Good");
        } else {
            System.out.println("You're not Good ");
        }
        //If-elseIf-else statement

        if(age>18){
            System.out.println("OK");
        }
        else if (age<18 && age>15){
            System.out.println("You Can have learner permit");
        }
        else if (age<15 && age>11){
            System.out.println("You can apply for non driver id");
        }else {
            System.out.println("You're too young. ");
        }
    }
}
