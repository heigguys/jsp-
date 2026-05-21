package com.nie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 获取Session对象

 */
@WebServlet("/serv10")
public class Servlet10 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session对象
        HttpSession session = req.getSession();

        System.out.println(session.getId());
        System.out.println(session.getCreationTime());
        System.out.println(session.getLastAccessedTime());
        System.out.println(session.isNew());
        // 设置session对象
        session.setAttribute("uname", "zhangsan");
        // 获取session对象
        String uname = (String) session.getAttribute("uname");
        // 设置过期时间
        session.setMaxInactiveInterval(30);
        // 移除session对象
        session.removeAttribute("uname");
    }

}
