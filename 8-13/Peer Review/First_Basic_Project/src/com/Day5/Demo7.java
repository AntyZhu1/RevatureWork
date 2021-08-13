package com.Day5;
class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for (int a=0;a<5;a++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name: "+Thread.currentThread().getName());
            System.out.println(a);
        }
    }
}
public class Demo7 {
    public static void main(String[] args) {
        ThreadJoinDemo t1=new ThreadJoinDemo();
        ThreadJoinDemo t2=new ThreadJoinDemo();
        ThreadJoinDemo t3=new ThreadJoinDemo();


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();


    }
}
