package com.example.demo.services;

import com.example.demo.Dao.OrderDao;
import com.example.demo.entities.Or_der;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderservicesimp implements Orderservices {
    @Autowired
    private OrderDao orderdao;
    @Override
    public List<Or_der> Getorder()
    {

        return orderdao.findAll();
    }
    public Or_der Addorder(Or_der order)
    {
        orderdao.save(order);
        return order;
    }
    public void Deleteorder(String orderid)
    {
        orderdao.deleteById(orderid);
    }
    public Or_der Updateorder(Or_der order)
    {
        orderdao.save(order);
        return order;
    }
    public Or_der Getorderbyid(String orderid)
    {
        return orderdao.getReferenceById(orderid);
    }

}
