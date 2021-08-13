package com.Day3;

public class Demo22 {
    public static void main(String[] args) {


        // case 1
        try {
            int c=10/5;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("case 1");
        }
        // case 2
        try {
            int c=10/0;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("case 2");
        }
        // case 3
        try {
            int c=10/0;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("case 3");
        }

    }
}
