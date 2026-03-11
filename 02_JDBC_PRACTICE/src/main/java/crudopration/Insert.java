package crudopration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/company";
		String user="postgres";
		String pass="root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			System.out.println("load driver");
			Connection c= DriverManager.getConnection(url,user,pass);
			System.out.println("get connecction");
			Statement s= c.createStatement();
			System.out.println("cretae statment");
			String query="INSERT INTO employee VALUES (3,'Vishal Jadhav',7563214569,'Satara')";
			s.execute(query);
			System.out.println("exexute query ");
			c.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
