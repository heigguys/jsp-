package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 获取Session对象

 */
@WebServlet("/serv09")
public class Servlet10 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        System.out.println(session.getId());
        System.out.println(session.getCreationTime());
        System.out.println(session.getLastAccessedTime());
        System.out.println(session.isNew());

    }

}
