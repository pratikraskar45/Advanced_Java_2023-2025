package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/a")
public class PageA extends HttpServlet {
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is a pageA http servlet");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Hi this is a http servlet</h1>");
		
	}
	

}
