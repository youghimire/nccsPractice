/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbctest.model;

/**
 *
 * @author yough
 */
public class Product {
    Integer productId;
    Integer categoryId;
    String name;
    Float price;
    Integer discount;
    String unit;
    Integer stock;
    
    public Product() {
        
    }

    @Override
    public String toString() {
        return "Id " + productId + " Name " + name;
    }
    
    
    public Product(int productId, int categoryId, String name, float price, int discount, String unit, int stock) {
        this();
        this.productId = productId;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.unit = unit;
        this.stock = stock;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    
    
}
