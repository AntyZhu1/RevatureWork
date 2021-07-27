package com.anthony;

public class Loops {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 5; x++) {
				System.out.println("inner for");
			}
			
			System.out.println("For");
			System.out.println(" ");
		}
		
		int w = 0;
		while (w < 5) {
			w++;
			
			System.out.println("While");
		}
		
		System.out.println("");
		int dw = 0;
		
		do {
			System.out.println("doing while");
			dw++;
		}while (dw < 5);
	}
}
