package com.anthony;

public class StringTesting {
	public static void main(String[] args) {
	
		String s1 = "Hello World";
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(5));
		
		System.out.println(s1.contains("He"));
		
		String s2 = "Hello";
		
		String s3 = "World";
		
		String.join(s3);
		
		System.out.println(s2);
		
		System.out.println(s1.equals("Hello World"));
		
		String splitMe = "Hello World";
		
		System.out.println(s1.substring(0, 5));
		
		String[] splitArray = splitMe.split(" ");
		
		System.out.println(splitArray[0]);
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);
		
		sb.append(" World");
		
		System.out.println(sb);
	}
}
