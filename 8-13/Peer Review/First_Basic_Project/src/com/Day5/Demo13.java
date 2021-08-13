package com.Day5;

public class Demo13 {
    public static void main(String[] args) {
        final String res1 = "first res";
        final String res2 = "second res";

        Thread t1 = new Thread() {

            @Override
            public void run() {
                synchronized (res1) {
                    System.out.println("Thread 1: res--1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2) {
                        System.out.println("Thread 1: res--2");
                    }
                }

            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (res2){
                    System.out.println("Thread 2: res--2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1){
                        System.out.println("Thread 2: res--1");

                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
