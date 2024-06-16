package com.example.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String product_Id;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Or_der> or_der;
    private String product_name;
    private int product_price;
    private String product_category;
    private int product_age;
    private String owner_id;
    private String image_path;
    public String getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(String product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String category) {
        this.product_category = category;
    }

    public int getProduct_age() {
        return product_age;
    }

    public void setProduct_age(int age) {
        this.product_age = age;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String name) {
        this.product_name = name;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int price) {
        this.product_price = price;
    }



}
