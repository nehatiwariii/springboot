package com.example.demo.services;

import com.example.demo.Dao.UserDao;
import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimp implements Userservices{

    @Autowired
    private UserDao userdao;
    public Userserviceimp() {}
    @Override
    public User AddUser(User user) {
        userdao.save(user);
        return user;
    }
    @Override
    public User GetUser(String userid){
        return userdao.getReferenceById(userid);
    }
    @Override
    public User UpdateUser(User user)
    {
        userdao.save(user);
        return user;
    }
    @Override
    public void DeleteUser(String userid)
    {
        userdao.deleteById(userid);
    }




}
