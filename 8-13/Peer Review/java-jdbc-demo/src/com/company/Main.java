package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("\n************This is my 1st table query**********\n");

        //step:1 load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "12345";

        //step: 2 Create connection Object
        Connection con = DriverManager.getConnection(url, username, password);

        //step: 3 Create Statement Object
        Statement statement = con.createStatement();

        // Step 4: Execute Query
        String sql1="select * from admin";
        ResultSet resultSet = statement.executeQuery(sql1);


        while (resultSet.next()) {
            System.out.println("id " + resultSet.getInt(1) +
                    ", name: " + resultSet.getString(2) +
                    ", Email: " + resultSet.getString(3) +
                    ", Password: " + resultSet.getString(4));
        }

        // Step 5: Close the connection
        con.close();
        System.out.println("\n************This is my 2nd table query**********\n");

        //step: 2 Create connection object
        Connection con2 = DriverManager.getConnection(url, username, password);
        //step: 3 Create Statement Object

        Statement statement2 = con2.createStatement();

        //step: 4 Execute Query
        String sql2 = "select * from customer";
        ResultSet resultSet2 = statement2.executeQuery(sql2);

        while (resultSet2.next()) {
            System.out.println("Customer id: " + resultSet2.getInt(1)
                    + ", Name: " + resultSet2.getString(2)
                    + ", Address: " + resultSet2.getString(3)
                    + ", Purchase date: " + resultSet2.getString(4));
        }
        // Step 5: Close the connection
        con2.close();


        System.out.println("\n************This is my 3rd table query**********\n");


        //step: 2 connection
        Connection con3 = DriverManager.getConnection(url, username, password);

        // step:3 create statement
        Statement statement3 = con3.createStatement();

        //step: 4 Execute Query
        String sql3 = "select * from employee";

        ResultSet rs3 = statement3.executeQuery(sql3);

        while (rs3.next()) {
            System.out.println("Employee Id: " + rs3.getInt(1)
                    + ", Working Hours: " + rs3.getInt(2)
                    + ", Name: " + rs3.getString(3));
        }
        // Step 5: Close the connection
        con3.close();
    }
}
