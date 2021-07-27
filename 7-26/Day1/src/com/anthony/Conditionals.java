package com.anthony;

import java.util.Scanner;  // Import the Scanner class

//public class Demo4 {
//    public static void main(String[] args) {
//
//        int age = 20;
//
////        if(age > 18){
////            System.out.println("eligible");
////        }else{
////            System.out.println("not eligible");
////        }
//
//        if(age > 18)
//            System.out.println("eligible");
//        else
//            System.out.println("not eligible");
//
//
//    }
//}

public class Conditionals {
	
	public static void main(String[] args) {
		
		int x = 0;
		
		if (x == 0) {
			System.out.println("X is 0");
		}
		
		else {
			System.out.println("X is not 0");
		}
		
		
		String s = "Hello World";
		
		if (s.equals("Hello World")) {
			
			System.out.println(s);
			
		}
		
		Scanner userIn = new Scanner(System.in);
		
		int y = userIn.nextInt();
		
        String result = (y % 2 == 0) ? "even" : "odd";
        
        System.out.println(result);
		
	}

}
