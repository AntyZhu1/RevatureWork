package com.anthony;

class Person {
	public String name;
	public int age;
	
	public void printPerson( ) {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

class PrivatePerson{
	private String pName;
	private int pAge;
	
	public void printPrivatePerson() {
		System.out.println(this.pName);
		System.out.println(this.pAge);
	}
}

class Car{
	public String company;
	public String model;
	
	public double currentSpeed = 0;
	
	public double maxSpeed;
	
	Car(){
		
	}
	
	Car(String c, String m, double maxSpeedIn) {
		
		this.company = c;
		this.model = m;
		this.maxSpeed = maxSpeedIn;
		
		
	}
	
	public void printCar() {
		
		System.out.println("This is a: " + this.company + " " + this.model + " with a max speed of: " + this.maxSpeed + "MPH");
	}
	
	public void setCompany(String companyIn) {
		
		this.company = companyIn;
		
	}
	
	public void setModel(String modelIn) {
		
		this.model = modelIn;
	}
		
	public void setMaxSpeed(double maxSpeedIn) {
		
		this.maxSpeed = maxSpeedIn;
	}
	
	
	public void accelerate(double accelerateBy) {
		
		if (this.currentSpeed + accelerateBy <= this.maxSpeed) {
			
			currentSpeed += accelerateBy;
			
			System.out.println("Accelerating by " + accelerateBy + " MPH!");
			
			System.out.println("Going " + currentSpeed + " MPH!");
			
		}
		
		else {
			
			double toMaxSpeed = this.maxSpeed - this.currentSpeed;
			
			currentSpeed += toMaxSpeed;
			
			System.out.println("Going " + currentSpeed + " MPH!");
			System.out.println("Speed is at MAX!");
			
		}
	}
	
	public void deccelerate(double deccelerateBy) {
		
		if  (this.currentSpeed - deccelerateBy > 0) {
			
			currentSpeed -= deccelerateBy;
			
			System.out.println("Slowing by " + deccelerateBy + " MPH!");
			
			System.out.println("Going " + currentSpeed + " MPH!");
			
		}
		
		else {
			currentSpeed = 0;
			
			System.out.println("Slowing to a stop!");
		}
	}
	
}



public class TestingClass {
	public static void main(String[] args) {
		Car c = new Car("Ford", "F150", 480);
		
		c.printCar();
		
		c.accelerate(150);
		c.accelerate(999);
		
		c.deccelerate(150);
		c.deccelerate(999);
	}
}
