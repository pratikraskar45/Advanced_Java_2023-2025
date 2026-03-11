package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/college";
		String user="postgres";
		String pass="root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url,user,pass);
			Statement stm= con.createStatement();
			String query="SELECT * FROM student";
			ResultSet rs= stm.executeQuery(query);
			System.out.println("----all fetch student------");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getLong(4));
				System.out.println("=======================================");
				
			}
			con.close();
			System.out.println("Record is fetched and connection is closed");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
