package com.example.login.demo.service.Impl;

import com.example.login.demo.dao.Impl.UserDaoImpl;
import com.example.login.demo.dao.UserDao;
import com.example.login.demo.entity.User;
import com.example.login.demo.service.UserService;


public class UserServiceImpl implements UserService {
    //Access Data
    private UserDao userDao = new UserDaoImpl();

    public User login(String loginId, String loginPwd) {

        return userDao.login(loginId, loginPwd);
    }

}
