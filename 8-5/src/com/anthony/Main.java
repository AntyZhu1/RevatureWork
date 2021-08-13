package com.anthony;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("--------------------------------------------");
		System.out.println("Select from the Following: "
				+ "\n"
				+ "1) Add Employee "
				+ "2) Update Employee "
				+ "3) Delete Employee "
				+ "4) Get All Employees "
				+ "5) Search for Employee by ID "
				+ "6) Quit"
				+ "\n"
				+ "--------------------------------------------");
		System.out.println("");
		
		Scanner userIn = new Scanner(System.in);
				
		boolean finished = false;
		
		while (!finished) {
			int userSelection = userIn.nextInt();
			
			switch (userSelection) {
			
			case 1:
				Employee newEmployee = new Employee();

				System.out.println("Enter Employee First Name");
				String firstName = userIn.next();
				System.out.println("Enter Employee Last Name");
				String lastName = userIn.next();
				System.out.println("Enter Employee Username");
				String username = userIn.next();
				System.out.println("Enter Employee Password");
				String password = userIn.next();
				
				newEmployee.setFirstName(firstName);
				newEmployee.setLastName(lastName);
				newEmployee.setUsername(username);
				newEmployee.setPassword(password);
				
				EmployeeDAO empDAO = EmployeeDAOFactory.getEmployeeDao();
				empDAO.addEmployee(newEmployee);
				
				break;
				
			case 2:
				
				Employee updater = new Employee();
				
				System.out.println("Enter New Employee ID");
				int newID = userIn.nextInt();
				System.out.println("Enter New Employee First Name");
				String newFirstName = userIn.next();
				System.out.println("Enter New Employee Last Name");
				String newLastName = userIn.next();
				System.out.println("Enter New Employee Username");
				String newUsername = userIn.next();
				System.out.println("Enter New Employee Password");
				String newPassword = userIn.next();
				
				updater.setId(newID);
				updater.setFirstName(newFirstName);
				updater.setLastName(newLastName);
				updater.setUsername(newUsername);
				updater.setPassword(newPassword);
				
				EmployeeDAO empDAOUpdater = EmployeeDAOFactory.getEmployeeDao();
				empDAOUpdater.updateEmployee(updater);
				
				break;
				
			case 3:
				
			case 4:
				
			case 5:
				finished = true;
				break;
		}
		
		
		
		
		}
		
		
		
		
		//Writing Data
//		Employee e = new Employee();
//		
//		e.setFirstName("John");
//		e.setLastName("Doe");
//		e.setUsername("john");
//		e.setPassword("doe");
//
//		//Employee Dao
//		EmployeeDAO empDAO = EmployeeDAOFactory.getEmployeeDao();
//		empDAO.addEmployee(e);
	}

}
