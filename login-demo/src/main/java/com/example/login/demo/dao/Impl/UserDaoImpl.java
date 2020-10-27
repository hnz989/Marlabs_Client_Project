package com.example.login.demo.dao.Impl;

import com.example.login.demo.dao.UserDao;
import com.example.login.demo.entity.User;

public class UserDaoImpl implements UserDao {
/**
 *
 *@param: 
 *@param:  
 *@return 
 */
    @Override
    public User login(String loginId, String loginPwd) {

        User user = null;
        if("admin".equals(loginId))
        {
            if("admin".equals(loginPwd))
            {
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                user.setUsername("Kyle");
                return user;
            }
        }
        return null;
    }
}
