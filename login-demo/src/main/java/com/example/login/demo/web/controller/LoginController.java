package com.example.login.demo.web.controller;

import com.example.login.demo.entity.User;
import com.example.login.demo.service.Impl.UserServiceImpl;
import com.example.login.demo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);

        //Login fa
        if(user == null)
        {
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
        //Login successful
        else{
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }
    }
}
