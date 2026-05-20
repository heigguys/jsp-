package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie对象

 */
@WebServlet("/serv08")
public class Servlet08 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        Cookie cookie = new Cookie("name", "zhangsan");
        // cookie设置
        cookie.setMaxAge(-1);
        cookie.setPath("/");

        resp.addCookie(cookie);

//        resp.getWriter().write("你好");
//        resp.getOutputStream().write("hello".getBytes());
        // resp.getOutputStream().write("<h2>你好</h2>".getBytes());

    }

}
