package com.anthony;

class Bank {
	int balance = 10000;
	
	synchronized void withdraw (int withdrawAmount) {
		System.out.println("You are trying to withdraw $" + withdrawAmount + ". Checking account...");
		try {
			wait();
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance -= withdrawAmount;
		
		System.out.println("Withdraw Successful, your new balance is :"
				+ "\n"
				+ "$"
				+ balance
				);
	}
	
    synchronized void deposit(int depositAmount){
        System.out.println("You want to deposit $" + depositAmount + ". Processing...");
        balance += depositAmount;
        System.out.println("Deposit Successful, your new balance is :"
				+ "\n"
				+ "$"
				+ balance
				);
        notify();
    }
	
	public void setBalance(int balanceSet) {
		this.balance = balanceSet;
	}
	

}

class DepositThread extends Thread {
	Bank bank;
	
	public DepositThread(Bank b) {
		this.bank = b;
	}
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.deposit(1000);
		super.run();
	}
}

class WithdrawThread extends Thread{
    Bank bank;
    int withdrawAmount;

    public WithdrawThread(Bank b){
        this.bank = b;
    }

    @Override
    public void run() {
        bank.withdraw(1000);
    }
}

public class BankExample {
	public static void main(String[] args) {
		Bank chase = new Bank();
		DepositThread depositThread = new DepositThread(chase);
		WithdrawThread withdrawThread = new WithdrawThread(chase);
		
		withdrawThread.start();
		depositThread.start();
	}


}
