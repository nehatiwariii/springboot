package com.example.demo;

import java.util.List;

public interface Productservices {
    public List<Product> Getproducts();
    public Product Getproduct(long productid);
    public Product Addproduct( Product p);
    public Product Updateproduct(Product p);
}
