package com.anthony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {

	int id;
	String firstName;
	String lastName;
	int age;
	
	public Student(int id, String firstName, String lastName, int age) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	
	public String toString() {
		return "Student{" +
                "id=" + id +
                ", First name='" + firstName + '\'' +
                ", Last name=" + lastName +
                 '\'' + ", Age = " + age + '}' 
                ;
		
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

class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.id > o2.id) {
			return 1;
		}
		else if (o1.id < o2.id){
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}

class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
        if(s1.age > s2.age) {
        	return 1;
        }
            
        else if(s1.age < s2.age) {
        	return -1;
        }
            
        else {
        	return 0;
        }
            
		
	}
	
}

public class SortingTest {
	
	public static void main(String[] args) {
		
		Student johnWilliams = new Student(1, "John", "Williams", 31 );
		
		Student albertEinstien = new Student(2, "Albert", "Einstien", 51);
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(albertEinstien);
		students.add(johnWilliams);
		
		System.out.println("Before");
		for (Student student : students) {
			System.out.println(student);
		}
		
		Collections.sort(students);
//		Collections.reverse(students);
		
		System.out.println("After");
		for (Student student : students) {
			System.out.println(student);
		}
		
		Student louisPasteur = new Student(3, "Louis", "Pasteur", 42);
		students.add(louisPasteur);
		
		
		System.out.println("");
		System.out.println("Before");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("");
		Collections.sort(students, new SortByAge());
		System.out.println("Sort By Age");
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
	
}
