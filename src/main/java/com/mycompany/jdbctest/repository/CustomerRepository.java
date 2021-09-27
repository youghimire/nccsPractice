/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository;

import com.mycompany.jdbctest.model.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yough
 */
public class CustomerRepository {
    
    private Customer customer;
    public boolean containsEmail(String email) throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from customers where email = '" + email + "'");
        while(result.next()) {
            customer = new Customer(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
            return true;
        }
        return false;
    }
    
    public boolean isAdmin(){
        return "admin@onlinestore.com".equals(customer.getEmail());
    }
    public Customer getCustomer() {
        return customer;
    }
}
