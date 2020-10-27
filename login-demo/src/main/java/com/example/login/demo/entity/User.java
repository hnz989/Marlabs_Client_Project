package com.example.login.demo.entity;

import java.io.Serializable;
/**
*@ClassName: User
*@Description
*@Author Kyle Zheng
*@version 1.0.0
*@Date 10/26/20 12:08 PM
*/

public class User implements Serializable {
    private String username;
    private String loginPwd;
    private String loginId;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", loginId='" + loginId + '\'' +
                '}';
    }
}

