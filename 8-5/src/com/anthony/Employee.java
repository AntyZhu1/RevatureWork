package com.anthony;

import java.sql.*;
import java.util.*;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String employeeUsername;
    private String employeePassword;

    public Employee(){

    }

    public Employee(int id, String firstName, String lastName, String employeeUsername, String employeePassword) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return employeeUsername;
    }

    public void setUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }
    
    public String getPassword() {
        return employeePassword;
    }

    public void setPassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }
}
