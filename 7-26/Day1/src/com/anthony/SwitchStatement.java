package com.anthony;

import java.util.Scanner;  // Import the Scanner class

public class SwitchStatement {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int choice = in.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Option 1");
		
		case 2:
			System.out.println("Option 2");
			
		case 3:
			System.out.println("Option 3");
		
		}
		
		
	}
}
