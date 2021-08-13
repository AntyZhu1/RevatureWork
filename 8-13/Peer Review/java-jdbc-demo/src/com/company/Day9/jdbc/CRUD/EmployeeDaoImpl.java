package com.company.Day9.jdbc.CRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDaoImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public void addEmaployee(Employee employee) throws SQLException {

        String sql = "insert into employee(name,username,password) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getUsername());
        preparedStatement.setString(3, employee.getPassword());

        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee saved");
        else
            System.out.println("Something went wrong!!!!!");

    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {

        String sql = "update employee set name=?,username=?,password=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getUsername());
        preparedStatement.setString(3, employee.getPassword());
        preparedStatement.setInt(4, employee.getEmplId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee Updated!!!!");
        else
            System.out.println("Something went wrong");

    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("Employee deleted!!!!!!!!");
        } else {
            System.out.println("Something went wrong");
        }

    }

    @Override
    public List<Employee> getEmployee() throws SQLException {
        List<Employee> employees = new ArrayList<>();

        String sql = "select * from employee";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {

            Employee employee = new Employee();

            employee.setEmplId(rs.getInt(1));
            employee.setName(rs.getString(2));
            employee.setUsername(rs.getString(3));
            employee.setPassword(rs.getString(4));

            employees.add(employee);
            // to see all value from the employee table
            System.out.println(employee);
        }
        rs.close();


        return employees;
    }

    @Override
    public Employee employeeById(int id) throws SQLException {

        String sql = "select * from employee where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        Employee e=null;
        while (rs.next()){
            e=new Employee(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));
        }

        if (e== null){
            System.out.println("Please provide the right employee id.\n");
        }
        else {
            System.out.println(e+"\n");

        }

        return e;
    }
}
