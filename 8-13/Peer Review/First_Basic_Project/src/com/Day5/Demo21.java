package com.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args) throws IOException {
        // it will first check do we have a file by this name
        // or it will create a new file
        FileWriter fw=new FileWriter("data.txt");
        fw.write(10);
        fw.write("This is some text\n");
        fw.write("Hi\n");
        char[] c={'a','b'};
        fw.write(c);
        //flush is for save the data into file
        fw.flush();
        fw.close();
    }
}