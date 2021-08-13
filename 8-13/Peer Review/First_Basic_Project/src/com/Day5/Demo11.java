package com.Day5;


class Table2{
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
class MyTh1 extends Thread{
    Table2 table2;
    public MyTh1(Table2 table2){
        this.table2=table2;
    }

    @Override
    public void run() {
        table2.printTable(5);
    }
}

class MyTh2 extends Thread{
    Table2 table2;
    public MyTh2(Table2 table2){
        this.table2=table2;
    }

    @Override
    public void run() {
        table2.printTable(15);
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Table2 table=new Table2();
        MyTh1 t1=new MyTh1(table);
        MyTh2 t2=new MyTh2(table);

        t1.start();
        t2.start();




    }
}
