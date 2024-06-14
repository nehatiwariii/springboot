package com.example.demo.services;

import com.example.demo.entities.Orders;

import java.util.List;

public interface Orderservices {
    public Orders Addorder(Orders order);
    public List<Orders> Getorder();
    public Orders Deleteorder(Orders order);
}
