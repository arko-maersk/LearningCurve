package org.example;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hey there, trying to setup SQL here");

        String url="jdbc:mysql://localhost:3306/world";

        Connection con= DriverManager.getConnection(url,"root","Newpass@123");
        String sqlQuery="select * from emp";
        Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery(sqlQuery);;
        while (rs.next()) {
            // Assuming 'emp' table has columns 'empid', 'name', and 'salary'
            int id = rs.getInt("empid");
            String name = rs.getString("name");
            int salary = rs.getInt("salary");

            // Print the results
            System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
        }


    }
}
