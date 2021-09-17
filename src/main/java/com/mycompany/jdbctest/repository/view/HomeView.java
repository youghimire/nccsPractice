/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.repository.view;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author yough
 */
public class HomeView {
    public void showMainPage() throws SQLException {
        System.out.println("Welcome to our store.");
        System.out.println("Please select:");
        System.out.println("1 Display products.");
        System.out.println("2 Add product.");
        System.out.println("3 Exit.");
        ProductView productView = new ProductView();
        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        switch(selectedOption) {
            case 1:
                productView.displayAllProducts();
                showMainPage();
                break;
            case 2:
                productView.addProduct();
                showMainPage();
                break;
            case 3:
                break;
        }
                


    }
}
