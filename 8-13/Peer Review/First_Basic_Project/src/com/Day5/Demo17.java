package com.Day5;

import java.io.File;
import java.io.IOException;

public class Demo17 {
    public static void main(String[] args) {
        File dir=new File("db");
        dir.mkdir();

        File file=new File("db","test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
