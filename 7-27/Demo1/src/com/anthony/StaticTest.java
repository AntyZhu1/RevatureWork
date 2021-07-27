package com.anthony;



class Student{
	
	String name;
	
	String grade;
	
	double gpa;
	
	static String school = "MSU";
	
	Student(){
		
	}
	
	Student(String nameIn, String gradeIn, double gpaIn){
		this.name = nameIn;
		this.grade = gradeIn;
		this.gpa = gpaIn;
	}
	
	public void printStudent() {
		System.out.println(this.name);
		System.out.println(this.grade);
		System.out.println(this.gpa);
		System.out.println(school);
	}
}

public class StaticTest {
	
	
	
	
	public static void main(String[] args) {
		
		
		Student s = new Student("Joe", "Junior", 3.13);
		
		s.printStudent();
		
		
		Student s2 = new Student("John", "Senior" , 3.24);
		
		s2.school = "UofM";
		
		s2.printStudent();
	}
}
