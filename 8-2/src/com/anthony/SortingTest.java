package com.anthony;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	int id;
	String firstName;
	String lastName;
	
	public Student(int id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	



	@Override
	public int compareTo(Student other) {
		if(id > other.id) {
			return 1;
		}
		else if(id < other.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
}

public class SortingTest {
	
	public static void main(String[] args) {
		
	}
	
	
	
}
