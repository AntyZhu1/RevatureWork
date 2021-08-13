package com.Day2;

class Company{
    public void publicTest(){

        System.out.println("Public test");
    }
    private void privateTest(){
        System.out.println("private test");

    }
    protected void protectedTest(){
        System.out.println("protected test");

    }
     void defualtTest(){
        System.out.println("default test");

    }
}
public class Demo29 {
    public static void main(String[] args) {
        Company company=new Company();
        // we can't call the private method outside the class

        company.publicTest();
        company.protectedTest();
        company.defualtTest();
    }
}
