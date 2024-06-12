package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private long idnum;
    private String name;
    private int price;
    private String description;
    public Product(long idnum, String name, int price, String description) {
        this.idnum = idnum;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public long getIdnum() {
        return idnum;
    }
    public void setIdnum(long idnum) {
        this.idnum = idnum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
