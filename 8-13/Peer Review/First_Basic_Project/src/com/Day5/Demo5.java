package com.Day5;
class ThreadNameDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running...");
    }
}
public class Demo5 {
    public static void main(String[] args) {
        ThreadNameDemo t1=new ThreadNameDemo();
        ThreadNameDemo t2=new ThreadNameDemo();

        System.out.println("Name of the t1: "+t1.getName());
        System.out.println("Name of the t2: "+t2.getName());

        t1.start();
        t2.start();

        t1.setName("HelloThread1");
        t2.setName("HelloThread2");

        System.out.println("After changing name t1: "+t1.getName());
        System.out.println("After changing name t2: "+t2.getName());


    }
}
