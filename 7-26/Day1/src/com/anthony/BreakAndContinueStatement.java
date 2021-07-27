package com.anthony;

public class BreakAndContinueStatement {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Breaking");
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("");
		
		for (int x = 0; x < 10; x++) {
			if (x == 5) {
				System.out.println("Continuing");
				continue;
			}
			System.out.println(x);
		}

	}

}
