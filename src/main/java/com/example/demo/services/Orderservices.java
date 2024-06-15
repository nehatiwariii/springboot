package com.example.demo.services;

import com.example.demo.entities.Or_der;

import java.util.List;

public interface Orderservices {
    public Or_der Addorder(Or_der order);
    public List<Or_der> Getorder();
    public Or_der Deleteorder(Or_der order);
}
