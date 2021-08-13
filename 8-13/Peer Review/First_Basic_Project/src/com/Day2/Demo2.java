package com.Day2;

// without static
//class Counter{
//    int count=0;
//    public Counter(){
//        count++;
//        System.out.println(count); // out put 1 1 1
//    }
//}
class Counter{
   static int count=0;
    public Counter(){
        count++;
        System.out.println(count); // output 1 2 3
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
