package com.ujiuye.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("/likeServlet")
public class LikeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        Integer count = (Integer) sc.getAttribute("count");
        if (count == null){
            count = 1;
        }else {
             count++;
        }
        sc.setAttribute("count",count);
        PrintWriter out = resp.getWriter();
        out.print(count);
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
