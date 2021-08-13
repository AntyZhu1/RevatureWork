package com.Day2;

class Calculator1{
    public void test(){
        System.out.println("1st Method");
    }
    public void test(int a){
        System.out.println("2nd Method");
    }
    public void test(int a, String b){
        System.out.println("3rd method");
    }
    public void test(String a,int b){
        System.out.println("4th method");
    }
    public void test(String a){
        System.out.println("5th method");
    }

}
public class Demo8 {
    public static void main(String[] args) {
        Calculator1 calculator1=new Calculator1();

        calculator1.test();
        calculator1.test(52);
        calculator1.test(25,"md");
        calculator1.test("Shihab",25);
        calculator1.test("mahi");
    }
}
