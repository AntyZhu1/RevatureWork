package com.anthony;

import java.sql.*;
import java.util.*;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;
    
    void updateEmployee(Employee employee) throws SQLException;
    
    void deleteEmployee(int id) throws SQLException;
    
    List<Employee> getEmployees() throws SQLException;
    
    Employee employeeById(int id) throws SQLException;
}
