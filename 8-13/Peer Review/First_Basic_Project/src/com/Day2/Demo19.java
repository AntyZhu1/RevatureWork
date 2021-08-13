package com.Day2;

interface IEmployee{
    void print();

}
class Employee implements IEmployee{

    @Override
    public void print() {
        System.out.println("Interface print method");
    }
}
public class Demo19 {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.print();
    }
}
