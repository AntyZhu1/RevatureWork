package com.anthony;

interface IBankAccount{
	
	boolean deposit(double amount);
	boolean withdraw(double amount);
	void getBalance();
	
}

class SavingAccount implements IBankAccount {
	
	private double _balance;
	private double _perDayLimit;

	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
			_balance += amount;
		}
		
		return true;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount <= _balance) {
			_balance -= amount;
			System.out.println("Withdrew " + amount + " from your account.");
			return true;
		}
		else {
			System.out.println("Insufficient Balance");
			return false;
		}
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}
	
}


class CurrentAccount implements IBankAccount{

	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		
	}
}
