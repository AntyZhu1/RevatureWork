package com.Day1;

class Employee01{
    public int emplId;
    public String firstName;
    public String lastName;
    public String email;

    public void getFullName(){
        System.out.println(this.firstName+" "+this.lastName);
    }
}
class FullTimeEmployee extends Employee01{
    public int annualSalary;
}
class PartTimeEmployee01 extends Employee01{
    public int hourlySalary;
}
public class Const01 {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee();
        fullTimeEmployee.firstName="mark";
        fullTimeEmployee.lastName="John";

        PartTimeEmployee01 partTimeEmployee01=new PartTimeEmployee01();
        partTimeEmployee01.firstName="md";
        partTimeEmployee01.lastName="uddin";

        fullTimeEmployee.getFullName();
        partTimeEmployee01.getFullName();





    }
}
