package com.jsp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PageA extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello i am  PageA ");
		PrintWriter pw=res.getWriter();
		
		pw.print("<h1>Hello i am a PageA  </h1> ");
		
	}

}
