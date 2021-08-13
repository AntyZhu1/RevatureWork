package com.company.Day9.jdbc.CRUD;

public class Employee {
    private int emplId;
    private String name;
    private String username;
    private String password;

    public Employee(){

    }

    public Employee(int emplId, String name, String username, String password) {
        this.emplId = emplId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplId=" + emplId +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
