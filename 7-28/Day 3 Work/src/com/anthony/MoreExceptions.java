package com.anthony;

/*
 * null pointer exception
 * 
 * throwable -> Exception -> RunTimeException
 */


class Customer {
	public void display() {
		System.out.println("Display...");
	}
}


public class MoreExceptions {
	public static void main(String[] args) {
		
		String str = "Mark";
		
		System.out.println(str.length());
		
		
		String str2 = null;
		
		
		try {
			System.out.println(str2.length());
		}
		catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
}
