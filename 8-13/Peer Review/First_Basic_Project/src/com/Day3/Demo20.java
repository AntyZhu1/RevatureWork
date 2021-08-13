package com.Day3;

class InsufficientFundException extends Exception{
    public  InsufficientFundException(){
        System.out.println("Insufficient Fund amount");
    }
    public InsufficientFundException(String msg){
        System.out.println(msg);
    }
}
class BankAccount{
    private int balance=0;
    private int accoutNumber;

    public BankAccount(int accoutNumber) {
        this.accoutNumber = accoutNumber;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println(" Deposited "+amount);
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if(amount<=balance){
            System.out.println("Withdrawed "+amount);
        }else {
            throw new InsufficientFundException("Sorry not enough money in your account");
        }
    }
    public int getBalance() {
        return balance;
    }

    public int getAccoutNumber() {
        return accoutNumber;
    }
}
public class Demo20 {
    public static void main(String[] args) {
     BankAccount account=new BankAccount(2121457);
        System.out.println(account.getBalance());
        account.deposit(4545);
        try {
            account.withdraw(2525);
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }
        account.deposit(525252);
        try {
            account.withdraw(2521222);
        } catch (InsufficientFundException e) {

        }


    }
}
