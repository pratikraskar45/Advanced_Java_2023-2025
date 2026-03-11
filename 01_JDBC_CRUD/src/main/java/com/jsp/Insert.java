package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/college";
		String user="postgres";
		String password="root";
		String driver="org.postgresql.Driver";
		try {
			//1-load the driver 
			Class.forName(driver);
			System.out.println("Load the driver");
			
			//2-Establish connection
			 Connection con=DriverManager.getConnection(url,user,password);
			 System.out.println("Establish Connection");
			 
			 //3-create statment 
			 Statement stm= con.createStatement();
			 System.out.println("Create the statement ");
			 String query="INSERT INTO student VALUES (2,'Pratik','usa',9555555555)";
			 
			 //4- execute the statment 
			 stm.execute(query);
			 System.out.println("query got executed");
			 
			 //5-close connection
			 con.close();
			 System.out.println("Connection is closed");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
