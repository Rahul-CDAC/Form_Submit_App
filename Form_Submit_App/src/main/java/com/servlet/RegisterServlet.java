package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("user_name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String course=req.getParameter("course");
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("<h1>Name: "+name + "</h1>");
		out.println("<h1>Email: "+email + "</h1>");
		out.println("<h1>Password: "+password + "</h1>");
		out.println("<h1>Course: "+course + "</h1>");
	}
	

}
