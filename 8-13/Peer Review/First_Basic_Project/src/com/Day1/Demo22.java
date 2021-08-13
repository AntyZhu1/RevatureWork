package com.Day1;

class Employee {

    public int empId;
    public String firstName;
    public String lastName;
    public String email;

    public void getFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

    class FullTimeEmpl extends Employee{
        public int annualSalary;
    }
    class PartTimeEmployee extends Employee{
        public int hourSalary;
    }




public class Demo22 {
    public static void main(String[] args) {

        FullTimeEmpl fte=new FullTimeEmpl();
        fte.firstName="md";
        fte.lastName="uddin";

        PartTimeEmployee pte=new PartTimeEmployee();
        pte.firstName="mark";
        pte.lastName="smith";

        fte.getFullName();
        pte.getFullName();
    }

}
