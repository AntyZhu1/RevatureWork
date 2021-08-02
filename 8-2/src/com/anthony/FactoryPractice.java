package com.anthony;

interface ICar{
	void getCarModel();
	void getCarColor();
}

class Audi implements ICar{

	@Override
	public void getCarModel() {
		System.out.println("Audi A6");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCarColor() {
		// TODO Auto-generated method stub
		System.out.println("Black");
		
	}
	
	
	
}

class BMW implements ICar {

	@Override
	public void getCarModel() {
		// TODO Auto-generated method stub
		System.out.println("S Class");
	}

	@Override
	public void getCarColor() {
		// TODO Auto-generated method stub
		System.out.println("White");
	}
	
}

public class FactoryPractice {
	public static void main(String[] args) {
		
		Audi car1 = new Audi();
		
		car1.getCarModel();
		car1.getCarColor();
		
		BMW car2 = new BMW();
		
		car2.getCarModel();
		car2.getCarColor();
		
	}
}
