package com.Day5;

import java.io.File;

public class Demo19 {
    public static void main(String[] args) {
        int count=0;

        File file=new File("db");

        String[] list=file.list();

        for (String s:list){
            // count for only file
            File f=new File(file,s);
            if (f.isFile()){
                count++;
                System.out.println(s);
            }
        }
        System.out.println("Total file and folder: "+count);

    }
}
