package com.sainsburys.lightninglunchbackend.models;

public class Product {
    private String productId;
    private String brand;
    private String name;
    private String description;
    private ProductPrice price;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public ProductPrice getPrice() { return price;}
    public void setPrice(ProductPrice price) {this.price = price;}

}
