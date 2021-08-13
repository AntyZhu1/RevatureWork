package com.Day3;
class Customer{
    public void display(){
        System.out.println("Hi");
    }
}
public class Demo26 {
    public static void main(String[] args) {
        String str="mark";
        System.out.println(str.length());
        String str2=null;

        try {
            System.out.println(str2.length());
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }

        Customer customer=new Customer();
        customer.display();

        Customer customer1=null;
        try {
            customer1.display();
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }

    }
}
