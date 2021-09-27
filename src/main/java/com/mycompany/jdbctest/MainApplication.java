/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest;

import com.mycompany.jdbctest.repository.DBConnection;
import com.mycompany.jdbctest.repository.ProductRepository;
import com.mycompany.jdbctest.model.Customer;
import com.mycompany.jdbctest.repository.view.HomeView;
import com.mycompany.jdbctest.repository.view.LoginView;
import com.mycompany.jdbctest.repository.view.ProductView;
import java.sql.*;

/**
 *
 * @author yough
 */
public class MainApplication {

    public static void main(String[] args) throws SQLException {

        LoginView login = new LoginView();
        if (login.authenticate()) {
            if (login.admin()) {
                HomeView homeView = new HomeView();
                homeView.showMainPage();
            } else {
                HomeView homeView = new HomeView();
                Customer customer = login.getCustomer();
                homeView.showCustomerPage(customer);
            }
        }

    }

}
