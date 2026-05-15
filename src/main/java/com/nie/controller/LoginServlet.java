package com.nie.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("uname");
        String password = req.getParameter("upwd");

        // 判断账号是否为空
        if (name == null || "".equals(name.trim())) {
            // 提示信息
            req.setAttribute("msg", "用户名不能为空");
            //请求跳转到login.jsp
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        // 判断密码是否为空
        if (password == null || "".equals(password.trim())) {
            // 提示信息
            req.setAttribute("msg", "密码不能为空");
            //请求跳转到login.jsp
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }
        // req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}



//@WebServlet("/loginServlet")
//public class LoginServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        String name = req.getParameter("uname");
//        String password = req.getParameter("upwd");
//
//        // 判断账号是否为空
//        if (name == null || "".equals(name.trim())) {
//            // 提示信息
//            req.setAttribute("msg", "用户名不能为空");
//            //请求跳转到login.jsp
//            req.getRequestDispatcher("/login.jsp").forward(req, resp);
//            return;
//        }
//
//        // 判断密码是否为空
//        if (password == null || "".equals(password.trim())) {
//            // 提示信息
//            req.setAttribute("msg", "密码不能为空");
//            //请求跳转到login.jsp
//            req.getRequestDispatcher("/login.jsp").forward(req, resp);
//            return;
//        }
//
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
//    }
//}
