package com.example.demo.Dao;

import com.example.demo.entities.Or_der;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Or_der, String> {
}
