package com.Day5;

class MultiThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("This Thread is from Runnable interface");
    }
}


public class Demo2 {
    public static void main(String[] args) {

        MultiThreadDemo2 multiThreadDemo2 = new MultiThreadDemo2();

        // Runnable interface doesn't have start(),so we have create Thread object
        // to execute the thread
        Thread t1 = new Thread(multiThreadDemo2);
        t1.run();
        t1.start();
    }
}
