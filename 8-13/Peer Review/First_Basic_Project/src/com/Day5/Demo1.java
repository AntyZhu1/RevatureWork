package com.Day5;


class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("This is multiThreading...........");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        MultiThreadDemo multiThreadDemo=new MultiThreadDemo();
        multiThreadDemo.start();
    }
}
