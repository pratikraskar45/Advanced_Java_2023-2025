package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/college";
		String user="postgres";
		String pass="root";
		String driver="org.postgresql.Driver";
		
		try {
			//1-LOAD DRIVER
			Class.forName(driver);
			//2-ESTABLISH CONNECTION
			Connection con= DriverManager.getConnection(url,user,pass);
			//3-CREATE STATEMNT 
			Statement stm= con.createStatement();
			String query="DELETE FROM student WHERE sid=1";
			//4-EXECUTE STATMENT 
			
			stm.execute(query);
			//5-CLOSE CONNECTION
			con.close();
			System.out.println("Record is deleted and connection is closed");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
