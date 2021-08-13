package com.Day5;

class SleepThreadDemo extends Thread{
    @Override
    public void run() {
        for (int a=0;a<10;a++){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a);
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        SleepThreadDemo sleep=new SleepThreadDemo();
        SleepThreadDemo sleep2=new SleepThreadDemo();

        sleep.start();
        sleep2.start();
    }
}
