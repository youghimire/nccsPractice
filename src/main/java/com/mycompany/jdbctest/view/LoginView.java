/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository.view;

import com.mycompany.jdbctest.model.Customer;
import com.mycompany.jdbctest.repository.CustomerRepository;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author yough
 */
public class LoginView {
    
    CustomerRepository customerRepository;
    public boolean authenticate() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scanner.next();
         customerRepository = new CustomerRepository();
        return customerRepository.containsEmail(email);
        
    }
    
    public boolean admin() {
        return customerRepository.isAdmin();
    }
    
    public boolean customer() {
        return !customerRepository.isAdmin();
    }
    
    public Customer getCustomer() {
        return customerRepository.getCustomer();
    }
}
