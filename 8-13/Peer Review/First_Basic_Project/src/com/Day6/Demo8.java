package com.Day6;


interface IBank{
    void deposit(int amount);
    void withdraw(int amount);
}

class SavingAcc implements IBank{

    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: "+amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: "+amount);
    }
}

class CheckingAcc implements IBank{
    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: "+amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: "+amount);
    }
}

class BusinessAcc implements IBank{
    @Override
    public void deposit(int amount) {
        System.out.println("Deposit amount: "+amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw amount: "+amount);
    }
}


class Factory{
    public static IBank getAcc(AccountType id){
        switch (id){
            case SAVING_ACCOUNT:
                return new SavingAcc();
            case CHECKING_ACCOUNT:
                return new CheckingAcc();
            case BUSINESS_ACCOUNT:
                return new BusinessAcc();
            default:
                return null;
        }
    }
}

enum AccountType{
    SAVING_ACCOUNT,
    CHECKING_ACCOUNT,
    BUSINESS_ACCOUNT
}

public class Demo8 {
    public static void main(String[] args) {
        IBank account=Factory.getAcc(AccountType.SAVING_ACCOUNT);
    }
}
