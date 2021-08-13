package com.Day5;

class Company{
    int item;
    boolean flag=false;

    synchronized void produce(int item){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.item=item;
            System.out.println("Produce: "+this.item);
            flag=true;
            notify();
        }

    }
    synchronized int consume(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Consume: "+item);
        flag=false;
        notify();
        return this.item;
    }

}
class Producer extends Thread{
    Company company;
    Producer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        int i=1;
        this.company.produce(i);
    }
}
class Consumer extends Thread{
    Company company;
    Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        int i=1;
        this.company.consume();
    }
}

public class Demo14 {
    public static void main(String[] args) {

        Company company=new Company();
        Producer producer=new Producer(company);
        Consumer consumer=new Consumer(company);

        producer.start();
        consumer.start();
    }
}
