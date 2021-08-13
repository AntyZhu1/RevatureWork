package com.Day1;

class Book3 {
    public String title;
    public String author;
    public int price;

    public void bookInfor() {
        System.out.println("Title: " + title + ", Author: " + author + ", price: " + price);
    }
}

public class BookObjectPublic {
    public static void main(String[] args) {
        Book3 book = new Book3();
        book.title = "Math";
        book.author = "Md";
        book.price = 20;
        book.bookInfor();

        Book3 book2 = new Book3();
        book2.title = "Java";
        book2.author = "shihab";
        book2.price = 150;
        book2.bookInfor();


    }
}
