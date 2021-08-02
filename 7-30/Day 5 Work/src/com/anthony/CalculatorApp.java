package com.anthony;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		
		printHelp();
		Scanner userIn = new Scanner(System.in);
		
		
		
		boolean finished = false;
		while (finished == false) {
			int optionSelected = userIn.nextInt();

			Scanner numbers = new Scanner(System.in);
			switch (optionSelected) {
			case 1:
				
				System.out.println("Add Selected");
				System.out.println("Enter first number");
				double add1 = numbers.nextDouble();
				System.out.println("Enter second number");
				double add2 = numbers.nextDouble();
				System.out.println("Adding " + add1 + " and " + add2);
				System.out.println("Result: " + (add1 + add2));
				System.out.println("");
				printHelp();
				break;
			case 2:

				System.out.println("Subtract Selected");
				System.out.println("Enter first number");
				double sub1 = numbers.nextDouble();
				System.out.println("Enter second number");
				double sub2 = numbers.nextDouble();
				System.out.println("Subtracting " + sub1 + " and " + sub2);
				System.out.println("Result: " +  (sub1 - sub2));
				System.out.println("");
				printHelp();
				break;
			case 3:

				System.out.println("Multiply Selected");
				System.out.println("Enter first number");
				double mult1 = numbers.nextDouble();
				System.out.println("Enter second number");
				double mult2 = numbers.nextDouble();
				System.out.println("Multiplying " + mult1 + " and " + mult2);
				System.out.println("Result: " +  (mult1 * mult2));
				System.out.println("");
				printHelp();
				break;
			case 4:

				System.out.println("Divide Selected");
				System.out.println("Enter first number");
				double div1 = numbers.nextDouble();
				System.out.println("Enter second number");
				double div2 = numbers.nextDouble();
				System.out.println("Dividing " + div1 + " and " + div2);
				System.out.println("Result: " +  (div1 / div2));
				System.out.println("");
				printHelp();
				break;
				
			case 0:
				System.out.println("Quitting");
				numbers.close();
				finished = true;
				break;
				
			default:
				System.out.println("");
				System.out.println("Error, invalid option");
				printHelp();
				break;
			}
			
			
		
		}
		userIn.close();
		
	}
		
	
	public static void printHelp() {
		System.out.println("Select from the Following Options"
				+ "\n"
				+ "1) Add"
				+ "\n"
				+ "2) Subtract"
				+ "\n"
				+ "3) Multiply"
				+ "\n"
				+ "4) Divide"
				+ "\n"
				+ "0) Quit");
		
	}
}
