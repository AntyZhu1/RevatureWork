package com.anthony;

interface IX{
	void print();
	interface IY {
		void display();
	}
}


class Z implements IX, IX.IY{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class NestedInterface {
	
	public static void main(String[] args) {
	
	}
}
