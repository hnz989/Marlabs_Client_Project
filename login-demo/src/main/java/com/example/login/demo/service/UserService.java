package com.example.login.demo.service;

import com.example.login.demo.entity.User;

public interface UserService {
    public User login(String loginId, String loginPwd);

}
