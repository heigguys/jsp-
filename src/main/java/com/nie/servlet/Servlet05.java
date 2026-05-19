package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/serv05")
public class Servlet05 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURL = req.getRequestURL().toString();
        System.out.println("requestURL:" + requestURL);
//        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Servlet被销毁了");
//        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet被创建了");
//        super.init();
    }
}
