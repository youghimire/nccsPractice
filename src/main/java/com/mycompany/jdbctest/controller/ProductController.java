/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.controller;

import com.mycompany.jdbctest.model.Product;
import com.mycompany.jdbctest.repository.ProductRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author yough
 */
public class ProductController {
    public List<Product> getAllProducts() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        List<Product> products = productRepository.getAllProducts();
        for(Product product : products) {
            product.setDiscountedPrice((product.getPrice() - product.getPrice()*product.getDiscount()/100));
        }
        return products;
               
    }

    public void save(Product product) throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        productRepository.save(product);
        
    }

}
