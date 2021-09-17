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
    
    public List<Product> getAllProducts() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        
        ResultSet rs = statement.executeQuery("select * from products");
        List<Product> products = new ArrayList<>();
        while(rs.next()) {
            Product product = new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
            products.add(product);
        }
        return products;
        
    }

    public void save(Product product) throws SQLException {
         Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        
        statement.executeUpdate("insert into products(category_id, name, price, unit) values (" + product.getCategoryId() + ", '" + product.getName() + "', " + product.getPrice() + ", '" + product.getUnit() + "')");
        
    }
}
