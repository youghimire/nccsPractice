/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository;

import java.sql.*;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author yough
 */
public class OrderRepository {
    
    public void save(Integer productId, Integer customerId) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("insert into orders(customer_id, order_DATE, status_id) values(" + customerId + ", '" + Date.valueOf(LocalDate.now()) + "', 1)" , Statement.RETURN_GENERATED_KEYS);
        statement.executeUpdate();
        ResultSet generatedKey = statement.getGeneratedKeys();
        Integer orderId = null;
        while(generatedKey.next()) {
             orderId = generatedKey.getInt(1);
        }
        Statement statement2 = connection.createStatement();
        statement2.executeUpdate("insert into orders_products(order_id, product_id, quantity) values(" + orderId + "," + productId + "," + 1 + ")");

    }
    
}
