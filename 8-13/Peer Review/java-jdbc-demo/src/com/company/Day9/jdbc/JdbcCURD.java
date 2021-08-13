package com.company.Day9.jdbc;

import java.sql.*;

public class JdbcCURD {
    public static void main(String[] args) throws SQLException {
        //step: 1 -> load the driver


        //step: 2-> Create connection
        String url="jdbc:mysql://localhost:3306/bank";
        String username="root";
        String password="12345";


        Connection con= DriverManager.getConnection(url,username,password);

        //step: 3 create statement object
        Statement statement=con.createStatement();

        //Demo: 1-> create a table


        /*
        String sql="create table admin(ad_id integer primary key auto_increment,name char(20),username char(30),password char(20))";
        statement.executeUpdate(sql);
        System.out.println("Table created");

         */


        //Demo: 2-> Insert data into our table

        String sql="insert into admin(name,username,password) values(?,?,?)";

        // Get PrepareStatement object
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        //set values to the PrepareStatement
        preparedStatement.setString(1,"shihab");
        preparedStatement.setString(2,"shihab");
        preparedStatement.setString(3,"123456");
        int rowCreated=preparedStatement.executeUpdate();

        System.out.println(rowCreated+" row(s) created");



        // Demo: 3-> update data of our table

        /*
        String sql="update admin set username=?,password=? where ad_id=?";

        PreparedStatement preparedStatement=con.prepareStatement(sql);
        // set the values
        preparedStatement.setString(1,"MdUddin");
        preparedStatement.setString(2,"123456");
        preparedStatement.setInt(3,1);

        int rowCreated=preparedStatement.executeUpdate();
        System.out.println(rowCreated+" row(s) Updated");

         */

        //Demo:4 -> Delete data from out table
/*
        String sql="delete from admin where ad_id=?";
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        preparedStatement.setInt(1,2);
        int rowCreated=preparedStatement.executeUpdate();
        System.out.println(rowCreated+" row(s) deleted");

 */
        //demo: 5-> Read the data from table

        String sql2="select * from admin";
        ResultSet rs=statement.executeQuery(sql2);

        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            String uName= rs.getString(3);
            String pWord= rs.getString(4);

            System.out.println("Id "+id+", name: "+name+", Username: "+uName+", Password: "+pWord);

        }

        //step: 5-> close connection

        con.close();
        if (con.isClosed()){
            System.out.println("Connection closed.");
        }else {
            System.out.println("Connection open.");
        }
    }
}
