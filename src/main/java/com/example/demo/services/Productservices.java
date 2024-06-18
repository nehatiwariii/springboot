package com.example.demo.services;

import com.example.demo.entities.Product;

import java.util.List;

public interface Productservices {
    public List<Product> Getproducts();
    public Product Getproduct(String productid);
    public Product Addproduct( Product p);
    public Product Updateproduct(Product p);
    public void Deleteproduct (String productid);
}
