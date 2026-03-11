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

import com.jsp.conn.ConnectionPool;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");
        String pwd2 = req.getParameter("pwd2");

        if (!pwd.equals(pwd2)) {
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            req.setAttribute("msg", "Password and confirm password do not match");
            rd.forward(req, resp);
            return; //
        }

        try {
            Connection con = ConnectionPool.giveConnection();
            String sql = "INSERT INTO pratik VALUES (?,?,?,?)";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setString(2, email);
            pstm.setString(3, pwd);
            pstm.setString(4, pwd2);

            int result = pstm.executeUpdate();
            ConnectionPool.submitConnection(con);

            if (result > 0) {
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                req.setAttribute("msg", "Registered successfully");
                rd.forward(req, resp);
                return;
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
                req.setAttribute("msg", "Failed to register");
                rd.forward(req, resp);
                return;
            }

        } catch (SQLException e) {
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            req.setAttribute("msg", "Email ID is already registered");
            rd.forward(req, resp);
            e.printStackTrace();
        }
    }
}
