package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Product;
@Service
public class Productserviceimp implements Productservices {
    List<Product> list;
    public Productserviceimp (){
        list= new ArrayList<>();
        list.add(new Product(1,"Tee-shirt", 1500, "clothes"));
        list.add(new Product(2,"Lipstick", 500, "cosmetics"));
        list.add(new Product(3,"cookies", 300, "eatables"));

    }
    @Override //agr ye ni hoga toh error dega implement keyword
    public List<Product> Getproducts() 
    {
        return list;

    }
    @Override
    public Product Getproduct( long productid)
    {
        Product p= null;
        for(Product prod: list)
        {
            if(prod.getIdnum()== productid)
        {
            p= prod;
            break;
        }
        }
        return p;
    }
    @Override
    public Product Addproduct (Product p)
    {
        list.add(p);
        return p;
    }
    @Override
    public Product Updateproduct (Product p)
    {
       list.forEach(e ->{
        if(e.getIdnum()== p.getIdnum())
        {
            e.setDescription(p.getDescription());
            e.setIdnum(p.getIdnum());
            e.setName(p.getName());
            e.setPrice(p.getPrice());
        }
       });
       return p;
    }
}
