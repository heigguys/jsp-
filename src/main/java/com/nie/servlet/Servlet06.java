package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Request请求乱码问题
 */
@WebServlet("/serv06")
public class Servlet06 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("uname");
        String password = req.getParameter("upwd");
        System.out.println("姓名:" + name);
        System.out.println("密码:" + password);


    }

}
