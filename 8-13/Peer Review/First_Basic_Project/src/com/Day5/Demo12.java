package com.Day5;

class Table3{
    public void printTable(int number){
        synchronized (this){
            for (int i=1;i<=5;i++){
                System.out.println(number*i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Demo12 {
    public static void main(String[] args) {
        Table3 table=new Table3();
        Thread t1=new Thread(){
            @Override
            public void run() {
                table.printTable(5);
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                table.printTable(10);
            }
        };

        t1.start();
        t2.start();



    }
}
