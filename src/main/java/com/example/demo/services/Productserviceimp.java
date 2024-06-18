package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Dao.ProductDao;
import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
@Service
public class Productserviceimp implements Productservices {
    @Autowired
    private ProductDao productdao;
    public Productserviceimp (){

    }
    @Override //agr ye ni hoga toh error dega implement keyword
    public List<Product> Getproducts() 
    {
        return productdao.findAll();

    }
    @Override
    public Product Getproduct( String productid)
    {
      return productdao.getReferenceById(productid);
    }
    @Override
    public Product Addproduct (Product p)
    {
            productdao.save(p);
        return p;
    }
    @Override
    public Product Updateproduct (Product p)
    {
        productdao.save(p);
        return p;
    }
    @Override
    public  void Deleteproduct (String productid)
    {
        productdao.deleteById(productid);

    }
}
