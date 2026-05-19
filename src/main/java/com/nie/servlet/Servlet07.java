package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Response对象
 * 1.响应数据
 * 2.乱码问题(服务端和客户端都有编码格式)
 */
@WebServlet("/serv07")
public class Servlet07 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //分别设置服务端和客户端的编码
//        resp.setCharacterEncoding("UTF-8");
//        // text/html设置了html格式，可以正常显示h2标签
//        resp.setHeader("content-type", "text/html;charset=UTF-8");
        //同时设置服务端和客户端的编码
        resp.setContentType("text/html;charset=UTF-8");


//        resp.getWriter().write("你好");
//        resp.getOutputStream().write("hello".getBytes());
        resp.getOutputStream().write("<h2>你好</h2>".getBytes());

    }

}
