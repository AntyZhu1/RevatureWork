package com.anthony;

import java.util.Scanner;  // Import the Scanner class

class TestException extends Exception {
	
	public TestException() {
		System.out.println("Printing Test Exception");
	}
	
}


class ExcpeptionThrowing {
	
	int x = 0;
	
	public int yeetingExceptions() throws TestException {
		
		if (x == 0) {
			
			throw new TestException();
		}
		
		return x;
				
	}
}

public class ExceptionHandling {
	
	public static void main(String[] args) throws TestException {
		
//		ExcpeptionThrowing et = new ExcpeptionThrowing();
//		
//		et.yeetingExceptions();
		
		
		// try do do this
		try {
			
			
			
		}
		
		//any exception
		catch (Exception e) {
		
		
			
		}
		
		
		//will always execute		
		finally {
		
			
		}
		
	}

}
