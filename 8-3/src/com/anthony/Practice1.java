package com.anthony;

class Calculator {
	
	
	public boolean areEqual(Object a, Object b) {
		if(a.equals(b)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public <E> boolean genericEqual(E a, E b) {
		if (a.equals(b)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
}

class GenericMethodDemo {
	
	public static <E> void printArray(E[] elements) {
		
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println("************");
		
	}
	
}

public class Practice1 {

	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.genericEqual(1, 3));
		
		Integer[] intArray = {1,2,3,4,5,6};
		Character[] charArray = {'a','b','c','d'};
		
		GenericMethodDemo.printArray(intArray);
		GenericMethodDemo.printArray(charArray);
		
		
	}
	
	
	
}
