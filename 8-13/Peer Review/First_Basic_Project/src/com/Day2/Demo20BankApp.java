package com.Day2;

interface IBankAccount{
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
}

class SavingAccount implements IBankAccount{

    private double balance;
    private double perDayLimit;

    @Override
    public boolean deposit(double amount) {
        balance +=amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance<amount){
            System.out.println("Not enough balance");
            return false;
        }else if(perDayLimit+amount>5000){
            System.out.println("Withdraw failed ");
            return false;
        }else {
            balance-=amount;
            perDayLimit+=amount;
            System.out.println("Successfully withdraw: "+amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving Account balance: "+balance);

    }
}
class CurrentAccount implements IBankAccount{

    private double balance;
    @Override
    public boolean deposit(double amount) {
        balance +=amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance<amount){
            System.out.println("Not enough balance ");
            return false;
        }else {
            balance-=amount;
            System.out.println("Successfully withdraw: "+amount);
            return true;
        }
    }

    @Override
    public void getBalance() {

        System.out.println("Current balance "+balance);
    }
}



class BankAppDemo20 {
    public static void main(String[] args) {
        IBankAccount saving=new SavingAccount();
        saving.deposit(25000);
        saving.withdraw(3000);
        saving.getBalance();

        IBankAccount currentAcc=new CurrentAccount();
        currentAcc.deposit(60000);
        currentAcc.withdraw(1000000);
        currentAcc.withdraw(2520);
        currentAcc.getBalance();

    }
}
