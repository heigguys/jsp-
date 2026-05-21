package com.nie.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 获取ServletContext对象

 */
@WebServlet("/serv11")
public class Servlet11 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过request对象获取
        ServletContext servletContext1 = req.getServletContext();

        // 通过session对象获取
        ServletContext servletContext2 = req.getSession().getServletContext();

        // 通过ServletConfig获取
        ServletContext servletContext3 = getServletConfig().getServletContext();

        // 直接获取
        ServletContext servletContext4 = getServletContext();
    }

}
