package com.example.demo;

import java.util.List;

import com.example.demo.entities.Or_der;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.services.Orderservices;
import com.example.demo.services.Productservices;
import com.example.demo.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @Autowired
    private Productservices prodser;
    @Autowired
    private Userservices userser;
    @Autowired
    private Orderservices orderser;
    @GetMapping ("/Products")
    public List<Product> Getproducts()
    {
       return this.prodser.Getproducts();
    }
    @GetMapping ("/Products/{productid}")
    public Product Getproduct( @PathVariable String productid)
    {
        return this.prodser.Getproduct( productid);
    }
    @PostMapping ("/Products")
    public Product Addproduct ( @RequestBody Product p)
    {
        return this.prodser.Addproduct(p);
    }
    @PutMapping("/Products")
    public Product Updateproduct ( @RequestBody Product p)
    {
        return this.prodser.Updateproduct(p);
    }
    @PostMapping("/Users")
    public User Adduser( @RequestBody User u)
    {
        return this.userser.AddUser(u);
    }
    @PostMapping("/Orders")
    public Or_der Addorder(@RequestBody Or_der o)
    {
        return this.orderser.Addorder(o);
    }
   }

