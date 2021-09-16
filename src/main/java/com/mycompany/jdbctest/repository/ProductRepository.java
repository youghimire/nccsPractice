/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository;

import java.sql.*;
import java.util.List;
import com.mycompany.jdbctest.model.*;
import java.util.ArrayList;

/**
 *
 * @author yough
 */
public class ProductRepository {
    
    public void displayAllProducts() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        
        ResultSet rs = statement.executeQuery("select * from products");
        ArrayList<Product> products = new ArrayList<>();
        while(rs.next()) {
            Product product = new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
            products.add(product);
        }
        
        for(Product product : products) {
            System.out.println(product.toString());
        }
    }
}
