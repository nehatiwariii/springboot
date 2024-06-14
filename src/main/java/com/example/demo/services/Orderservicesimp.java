package com.example.demo.services;

import com.example.demo.Dao.OrderDao;
import com.example.demo.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderservicesimp implements Orderservices {
    @Autowired
    private OrderDao orderdao;
    @Override
    public List<Orders> Getorder() {
        return orderdao.findAll();
    }
    public Orders Addorder(Orders order){
        orderdao.save(order);
        return order;
    }
    public Orders Deleteorder(Orders order)
    {
        orderdao.delete(order);
        return order;
    }
}
