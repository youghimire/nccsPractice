/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest;

import com.mycompany.jdbctest.repository.DBConnection;
import com.mycompany.jdbctest.repository.ProductRepository;
import java.sql.*;

/**
 *
 * @author yough
 */
public class MainApplication {
    public static void main(String[] args) throws SQLException {
        
        ProductRepository productRepository = new ProductRepository();
        productRepository.displayAllProducts();
    }
    
}
