package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long order_id;
    private long user_id;
    private long product_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date order_time;
    public Orders()
    {

    }

    public long getOrder_id() {
        return order_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public Orders (long user_id, long product_id, Date order_time)
    {
        this.user_id = user_id;
        this.product_id = product_id;
        this.order_time = order_time;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
