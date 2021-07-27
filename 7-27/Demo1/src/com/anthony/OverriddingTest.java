package com.anthony;

class Parent {
	
	
	public void greeting(String nameIn) {
		System.out.println("Hello " + nameIn);
	}
}

class Child extends Parent {
	public void greeting(String nameIn) {
		System.out.println("Hey, " + nameIn);
	}
}

public class OverriddingTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		p.greeting("Joe");
		
		c.greeting("Joe");
		
	}
}
