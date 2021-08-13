package com.Day5;

class TestCallRun extends Thread{
    @Override
    public void run() {
        for (int a=0;a<5;a++){
            try {
                Thread.sleep(555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(a);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        TestCallRun t1=new TestCallRun();
        TestCallRun t2=new TestCallRun();

//        t1.start();
//        t2.start();

        t1.run();
        t2.run();
    }
}
