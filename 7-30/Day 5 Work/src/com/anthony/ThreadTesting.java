package com.anthony;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class ThreadDemo extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
	
}

class ThreadNameDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is Running");
	}
}

class ThreadJoinDemo extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread");
	}
	
}

class WorkerThread implements Runnable {
	
	public String message;
	public WorkerThread(String m) {
		this.message = m;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start Message -> " + message);
		processMessage(); //Thread sleeps for 2 sec
		System.out.println(Thread.currentThread().getName() + " End Message -> " + message);
		
	}
	
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}



class Table {
	public synchronized void printTable(int num) {
		for (int i = 0; i < 10 ; i ++) {
			System.out.println(num + " x " + i + " = "  + num * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table table;
	public MyThread1(Table t) {
		this.table = t;
	}
	
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		table.printTable(5);
		super.run();
	}
}

class MyThread2 extends Thread {
	Table table;
	public MyThread2(Table t){
		this.table = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		table.printTable(500);
		super.run();
	}
}

public class ThreadTesting extends Thread{
	

	
	public static void main(String[] args) {
//		
//		ThreadDemo t1 = new ThreadDemo();
//		
//		t1.run();
//		
//		ThreadNameDemo t2 = new ThreadNameDemo();
//		System.out.println("name of t2 " + t2.getName());
//		
//		ThreadJoinDemo t3 = new ThreadJoinDemo();
		
//		ExecutorService executorService = Executors.newFixedThreadPool(5); //creating a pool of 5 threads
//		for (int i = 0; i < 10; i++) {
//			Runnable worker = new WorkerThread(" " + i);
//			executorService.execute(worker);
//		}
//		
//		executorService.shutdown();
//		
//		while (executorService.isTerminated()) {
//			
//		}
//		System.out.println("Finished All Threads");
		
		Table t = new Table();
//		t.printTable(MAX_PRIORITY);
		MyThread1 t1 = new MyThread1(t);
		t1.run();
		MyThread2 t2 = new MyThread2(t);
		t2.run();
	}
	
	
}
