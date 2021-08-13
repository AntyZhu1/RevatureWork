package com.Day1;


 class Book1{
    private String title;
    private  String author;
    private int price;

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

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public void printInfor(){
         System.out.println("Book: title= "+title+", Author:= "+author+", Price:= "+price);

     }
 }

public class Demo16 {
    public static void main(String[] args) {

        Book1 bookObj=new Book1();
        bookObj.setTitle("Math");
        bookObj.setAuthor("md");
        bookObj.setPrice(100);
        bookObj.printInfor();
    }
}
