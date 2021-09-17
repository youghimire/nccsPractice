/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yough
 */
public class DBConnection {
    
    static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6437842", "sql6437842", "PKH5VBVAtA");
        }
        return connection;
    }
    
}
