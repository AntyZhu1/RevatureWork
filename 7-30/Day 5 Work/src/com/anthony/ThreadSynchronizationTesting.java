package com.anthony;

class Table2 {
	public void printTable(int num) {
		//synchronized block
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(num * i);
			}
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread3 extends Thread {
	Table2 table;
	public MyThread3(Table2 t) {
		this.table = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		table.printTable(5);
		super.run();
	}
}

public class ThreadSynchronizationTesting {
	
	public static void main(String[] args) {
		Table2 tab2 = new Table2();
		MyThread3 t3 = new MyThread3(tab2);
		
		t3.start();
		
		
	}

}
