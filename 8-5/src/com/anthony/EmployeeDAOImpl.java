package com.anthony;

import java.sql.*;
import java.util.*;
import javax.swing.plaf.nimbus.State;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Statement statement = null;
    Connection con = null;
    
    public EmployeeDAOImpl()  {
        try {
            
        	this.con = ConnectionFactory.getConnection();
        
        }
        
        catch (SQLException throwables) {
            
        	throwables.printStackTrace();
        	
        }
    }
    
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		
		String request = "INSERT INTO employees (emp_username, emp_password, emp_firstname, emp_lastname) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setString(1, employee.getUsername());
		ps.setString(2, employee.getPassword());
		ps.setString(3, employee.getFirstName());
		ps.setString(4, employee.getLastName());
		
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Employee " + employee.getUsername() + " Added.");
		}
		else {
			System.out.println("An error has occurred, please check over process.");
		}
	}

	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		
		String request = "UPDATE employees SET emp_id = ?, emp_username = ?, emp_password = ?, emp_firstname = ?, emp_lastname = ? WHERE emp_id = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getUsername());
		ps.setString(3, employee.getPassword());
		ps.setString(4, employee.getFirstName());
		ps.setString(5, employee.getLastName());
		ps.setInt(6, employee.getId());
		
		int i = ps.executeUpdate();
		
		if(i > 0) {
			System.out.println("Employee " + employee.getUsername() + " Has been updated.");
		}
		else {
			System.out.println("An error has occurred, please check over process.");
		}
		
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		
		String request = "DELETE FROM employees where id = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();
		
		if (i > 0) {
			System.out.println("Deleted employee with id " + id);
		}
		else {
			System.out.println("An error has occurred, please check over process.");
		}
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		List<Employee> employees = new ArrayList<>();
		
		String request = "SELECT * FROM employees";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ResultSet output = ps.executeQuery();
		
		while (output.next()) {
			Employee tempEmployee = new Employee( output.getInt(1), output.getString(2), output.getString(3), output.getString(4), output.getString(5));
			employees.add(tempEmployee);
		}
		
		return employees;
	}

	@Override
	public Employee employeeById(int id) throws SQLException{
		
		String request = "SELECT * FROM employees WHERE emp_id = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setInt(1, id);
		
		ResultSet output = ps.executeQuery();
		
		Employee foundEmployee = new Employee(output.getInt(1), output.getString(2), output.getString(3), output.getString(4), output.getString(5));
		
		return foundEmployee;
	}

}
