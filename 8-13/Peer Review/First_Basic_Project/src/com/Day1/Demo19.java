package com.Day1;

class Test{
    int count;
    public Test(int count){
        this.count=count;
        System.out.println(this.count);
    }
}

public class Demo19 {
    public static void main(String[] args) {
        Test test=new Test(300);
    }
}
