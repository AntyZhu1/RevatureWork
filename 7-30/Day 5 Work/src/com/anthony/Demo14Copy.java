package com.anthony;

class Company {
	int item;
	//false = producer
	//true = consumer
	boolean flag = false;
	
	synchronized void produce(int item) throws InterruptedException{
		if (flag) {
			wait();
		}
		this.item = item;
		System.out.println("Produced Item: " + this.item);
		flag = true;
		notify();
	}
	
	synchronized int consume() throws InterruptedException {
		if(!flag) {
			wait();
		}
		System.out.println("Consumer: " + item);
		flag = false;
		notify();
		return this.item;
	}
}

class Producer extends Thread {
	Company company;
	public Producer(Company company) {
		this.company=company;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		try {
			this.company.produce(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
	
	
	
}

class Consumer extends Thread {
	Company company;
	Consumer(Company company){
		this.company = company;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		try {
			this.company.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
}

public class Demo14Copy {
	public static void main(String[] args) {
		Company c = new Company();
		
		Producer p = new Producer(c);
		Consumer consumer = new Consumer(c);
		
		p.run();
		consumer.run();
	}
}
