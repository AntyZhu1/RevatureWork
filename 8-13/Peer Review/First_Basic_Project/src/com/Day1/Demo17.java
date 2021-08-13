package com.Day1;

class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void printInf(){
        System.out.println("Book: title= "+title+", Author:= "+author+", Price:= "+price);

    }
}

public class Demo17 {
    public static void main(String[] args) {

        Book2 obj=new Book2("Title","md",100);
        obj.printInf();
    }
}
