package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/college";
		String user="postgres";
		String pass="root";
		String driver="org.postgresql.Driver"; 
		try {
			//1-load the driver
			Class.forName(driver);
			//2-establish connecton
			Connection con= DriverManager.getConnection(url,user,pass);
			//3-create statment 
			Statement stm= con.createStatement();
			String query="UPDATE student SET sname='Head' WHERE sid=3";
			//4-execute the query
			stm.execute(query);
			//5-close connection
			con.close();
			
			System.out.println("Record is updated and connection is closed");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
