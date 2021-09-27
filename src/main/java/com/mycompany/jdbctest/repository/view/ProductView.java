/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository.view;

import com.mycompany.jdbctest.model.Customer;
import com.mycompany.jdbctest.controller.ProductController;
import com.mycompany.jdbctest.model.Product;
import com.mycompany.jdbctest.repository.OrderRepository;
import com.mycompany.jdbctest.repository.ProductRepository;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yough
 */
public class ProductView {
    
    public void displayAllProducts() throws SQLException {
        
        ProductController productController = new ProductController();
        List<Product> products = productController.getAllProducts();
        for (Product product : products) {
            System.out.println(product.toString() );
        }
    }

    void addProduct() throws SQLException {
        System.err.println("Please provide product details:");
        System.out.println("Category Id:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        int categoryId = scanner.nextInt();
        System.out.println("Product name: ");
        String name = scanner.next();
        System.out.println("Enter price:");
        Float price = scanner.nextFloat();
        
        Product product = new Product(categoryId, name, price);
                ProductController productController = new ProductController();
                productController.save(product);

    }

   public void purchaseProduct(Customer customer) throws SQLException {
        System.err.println("Please provide purchase details:");
        System.out.println("Product Id:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        int productId = scanner.nextInt();
        
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.save(productId, customer.getCustomerId());
        
       
    }
    
}
