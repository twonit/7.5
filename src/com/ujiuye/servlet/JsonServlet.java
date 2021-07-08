package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jsonServlet")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student stu = new Student(1,"mary","g","18224053142","mary@qq.com");
        ObjectMapper map = new ObjectMapper();
        //String res = map.writeValueAsString(stu);
        String[] strs = {"abc","bcd","cde"};
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student(1,"mary","g","18224053142","mary@qq.com");
        Student stu2 = new Student(2,"lucy","g","18224053143","lucy@qq.com");
        Student stu3 = new Student(3,"tom","b","18224053144","tom@qq.com");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        String res = map.writeValueAsString(list);
        System.out.println(res);
        PrintWriter out = resp.getWriter();
        out.print(res);
        out.close();
    }
}
