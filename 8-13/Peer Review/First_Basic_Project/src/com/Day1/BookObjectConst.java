package com.Day1;


class Book5{
    private String title;
    private String author;
    private double price;

    public Book5(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void bookInfo(){
        System.out.println("Title: "+title+", Author: "+author+", Price "+price);
    }

}

public class BookObjectConst {
    public static void main(String[] args) {

        Book5 book=new Book5("python","mahi",500.25);
        book.bookInfo();




    }
}
