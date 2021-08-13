package com.anthony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


interface IHello {
	public String greeting();
}

interface IWelcome {
	public String greeting(String name);
}


class Customer {
	public int id;
	public String name;
	public int age;
	
	public Customer(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
	}
	
	
}

public class LambdaPractice {
	public static void main(String[] args) {
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		for (int i = 0; i < 10; i++) {
//			numbers.add(i);
//		}
//		numbers.forEach( (n) -> {System.out.println(n);});
	
//		IHello h = () -> {
//			
//			return "Welcome Guest";
//		};
//		
//		System.out.println(h.greeting());
//		
//		IWelcome welcome = (name) -> {
//			return "Welcome " + name;
//		};
//		
//		System.out.println(welcome.greeting("Paul"));
		
		ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(2, "Mark", 30));
        customers.add(new Customer(3, "Watson", 50));
        customers.add(new Customer(1, "Paul", 20));
        
        System.out.println("before sorting...");
        for(Customer customer: customers){
            System.out.println(customer);
        }

        Collections.sort(customers, (c1, c2) -> {
            return c1.name.compareTo(c2.name);
        });

        System.out.println("after sorting...");
        for(Customer customer: customers){
            System.out.println(customer);
        }
	}
	
	
}
