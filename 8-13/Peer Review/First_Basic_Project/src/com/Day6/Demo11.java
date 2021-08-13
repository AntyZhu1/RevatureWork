package com.Day6;

interface MultipleStatement {
    String print(String msg);
}

public class Demo11 {
    public static void main(String[] args) {
        MultipleStatement multipleStatement = (msg) -> {
          String str1="Statement 1, ";
            String str2="Statement 2, ";
            String str3="Statement 3 ";

            return str1+str2+str3;
        };
        System.out.println(multipleStatement.print("Hi"));
    }
}
