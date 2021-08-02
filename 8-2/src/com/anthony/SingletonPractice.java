package com.anthony;

class Calculator {
	
	public static int count = 0;
	
	private static Calculator instance = null;
	
	private Calculator() {
		count++;
		System.out.println("Count: " + count);
		System.out.println("Constructor Called");
		
		}
	
	public static Calculator getInstance() {
		if (instance == null) {
			instance = new Calculator();
		}
		return instance;
		
	}
}

public class SingletonPractice {
	
	public static void main(String[] args) {
		Calculator c1 = Calculator.getInstance();
	}
	

}
