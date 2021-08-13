package com.company.Day9.jdbc.CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    static int option = 0;

    public static void main(String[] args) throws SQLException {


        Employee employee = new Employee();
        EmployeeDao dao = EmployeeDaoFactory.getEmployeedao();

        do {
            System.out.println("Select your option here: ");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Read Employee");
            System.out.println("5. Find Employee By Id: ");
            System.out.println("6. Exit");

            option = input.nextInt();

            switch (option) {
                //add Employee here
                case 1:
                    System.out.println("Enter your Name: ");
                    String name = input.next();
                    System.out.println("Enter your username: ");
                    String uName = input.next();
                    System.out.println("Enter your Password: ");
                    String pWord = input.next();

                    employee.setName(name);
                    employee.setUsername(uName);
                    employee.setPassword(pWord);
                    dao.addEmaployee(employee);

                    break;

                //update Employee here
                case 2:
                    System.out.println("Enter your employee Id: ");
                    int upid = input.nextInt();
                    System.out.println("Enter your Name: ");
                    String upName = input.next();
                    System.out.println("Enter your username: ");
                    String upUName = input.next();
                    System.out.println("Enter your Password: ");
                    String upPWord = input.next();

                    employee.setEmplId(upid);
                    employee.setName(upName);
                    employee.setUsername(upUName);
                    employee.setPassword(upPWord);

                    dao.updateEmployee(employee);
                    break;

                // delete Employee here
                case 3:
                    System.out.println("Enter your employee Id: ");
                    int delid = input.nextInt();

                    dao.deleteEmployee(delid);
                    break;
                // Get all employee here
                case 4:
                    dao.getEmployee();
                    break;

                // Get employee by Id
                case 5:
                    System.out.println("Please enter Employee id here: ");
                    int emId = input.nextInt();
                    dao.employeeById(emId);
                    break;

                // This is the Exit option
                case 6:
                    System.out.println("Thank you for using our App!!!");
                    break;
                default:

                    System.out.println("You did not select valid option!!!!!!!!!!!\nPlease enter 1-6\n**********************************");
                    break;
            }
        } while (option != 6);


/*
        employee.setName("noman islam");
        employee.setUsername("noman");
        employee.setPassword("12345");


        dao.addEmaployee(employee);


 */

    }
}
