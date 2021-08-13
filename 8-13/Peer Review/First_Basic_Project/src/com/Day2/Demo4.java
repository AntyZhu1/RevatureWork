package com.Day2;

class Employee00{
    public int empId;
    public String name;
    public static String companyName="Ravautre";

    public Employee00(int empId,String name){
        this.empId=empId;
        this.name=name;
    }
    public void printInfor(){
        System.out.println("Id "+empId+" name "+name+" companyName "+companyName);
    }

}
public class Demo4 {
    public static void main(String[] args) {
        Employee00 employee=new Employee00(01,"mahi");
        Employee00 employee2=new Employee00(02,"md");

        employee.printInfor();
        employee2.printInfor();

        Employee00.companyName="ABC Corp";

        employee.printInfor();
        employee2.printInfor();


    }
}
