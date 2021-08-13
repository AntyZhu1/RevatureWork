package com.Day3;

public class Demo15 {
    public static void main(String[] args) {
        System.out.println("Speed Testing");

        long startTime=System.currentTimeMillis();
        StringBuffer stringBuffer=new StringBuffer("Hello");
        for(int i=0;i<100000000;i++){
            stringBuffer.append("World");
        }
        System.out.println("Time taken by StringBuffer "+(System.currentTimeMillis()-startTime)+" ms");

        System.out.println("-----------------------------------------");
        startTime=System.currentTimeMillis();
        StringBuilder stringBuilder=new StringBuilder("Hello");
        for(int i=0;i<100000000;i++){
            stringBuilder.append("World");
        }
        System.out.println("Time taken by stringBuilder "+(System.currentTimeMillis()-startTime)+" ms");

    }
}
