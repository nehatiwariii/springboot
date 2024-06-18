package com.example.demo.services;

import com.example.demo.entities.User;

public interface Userservices  {
    public User AddUser(User user);
    public User GetUser(String userid);
    public User UpdateUser(User user);
    public void DeleteUser(String userid);
}
