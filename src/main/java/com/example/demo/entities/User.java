package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long User_Id;
    private String User_Name;
    private String User_Email;
    private String User_Password;
    private String Phone_Number;
    public User()
    {

    }
    public User(String User_Name, String User_Email, String User_Password, String Phone_Number) {
        {
            this.User_Name = User_Name;
            this.User_Email = User_Email;
            this.User_Password = User_Password;
            this.Phone_Number = Phone_Number;

        }
    }

    public String getUser_Email() {
        return User_Email;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public void setUser_Email(String user_Email) {
        User_Email = user_Email;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }


}
