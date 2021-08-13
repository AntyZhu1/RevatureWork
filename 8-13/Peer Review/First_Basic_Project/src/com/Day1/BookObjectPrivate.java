package com.Day1;


class Book4{
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void bookInfo(){
        System.out.println("Title: "+title+", Author: "+author+", Price: "+price);
    }
}

public class BookObjectPrivate {
    public static void main(String[] args) {

        Book4 book=new Book4();
        book.setPrice(20.2);
        book.setAuthor("Ali");
        book.setTitle("English");
        book.bookInfo();





    }
}
