package com.example.demo.Dao;

import com.example.demo.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Orders, Long> {
}
