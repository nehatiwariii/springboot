package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
public class User {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String user_Id;
    private String user_name;
    private String user_email;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Or_der> or_der;

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String user_password;
    private String phone_number;
    private String address;
//    public User()
//    {
//
//    }
//    public User(String User_Name, String User_Email, String User_Password, String Phone_Number) {
//        {
//            this.user_name = User_Name;
//            this.user_email = User_Email;
//            this.user_password = User_Password;
//            this.phone_number = Phone_Number;
//        }
//    }



    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
