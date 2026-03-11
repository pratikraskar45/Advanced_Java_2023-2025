package com.jsp.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.connection.ConnectionPool;
@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String email=req.getParameter("uemail");
		String pwd=req.getParameter("upassword");
		try {
		Connection connection =ConnectionPool.giveConnection();
		String sql="INSERT INTO register VALUES(?,?,?) ";
			PreparedStatement pstm= connection.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, pwd);
			
			int result= pstm.executeUpdate();
			ConnectionPool.submitConnection(connection);
			if (result>0) {
				RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
				req.setAttribute("msg", "Register succesfully");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("msg","Faild to register");
				rd.forward(req, resp);
				

			}
		} catch (SQLException e) {
			RequestDispatcher rd =req.getRequestDispatcher("register.jsp");
			req.setAttribute("msg", "Email id is already register");
			rd.forward(req, resp);
			e.printStackTrace();
		}
		
	}

}
