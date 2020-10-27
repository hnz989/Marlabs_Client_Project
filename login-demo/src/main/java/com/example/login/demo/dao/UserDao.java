package com.example.login.demo.dao;

import com.example.login.demo.entity.User;

public interface UserDao {
    public User login(String id, String password);
}
