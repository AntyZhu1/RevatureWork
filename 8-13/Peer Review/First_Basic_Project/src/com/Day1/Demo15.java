package com.Day1;

class Book{
    //instance variable
    public String title;
    public String author;
    public int price;

    // method
    public void printInfo(){

        System.out.println("Book: title= "+title+", Author:= "+author+", Price:= "+price);
    }
}

public class Demo15 {
    public static void main(String[] args) {
        //book1 object
        Book book1=new Book();
        book1.title="java";
        book1.author="md";
        book1.price=120;
        book1.printInfo();
        // book2 object
        Book book2=new Book();
        book2.title="Angular";
        book2.author="shihab";
        book2.price=400;
        book2.printInfo();

    }
}
