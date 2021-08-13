package com.Day3;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo31 {
    public static void main(String[] args) {
        // creating an object of fileOutputStream
        try(FileOutputStream stream=new FileOutputStream("D:\\JavaFullStack\\First_Basic_Project\\src\\com\\Day3\\data.txt"))
        {
            // custom string input
            String data="Hi, I am writing from here";
            byte[] arr=data.getBytes();
            // convert string to bytes

            stream.write(arr);

            // catch block to handle exception

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("stream closed");
    }
}
