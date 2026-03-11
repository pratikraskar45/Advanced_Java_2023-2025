package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pageb")
public class PageB extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hi this is page b");
		int personid= (Integer) req.getAttribute("pid");
		String personname= (String) req.getAttribute("pname");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>This is page b</h1>");
		pw.print("<h2>pid: "+personid+"</h2>");
		pw.print("<h2>pname: "+personname+"</h2>");
	}

}
