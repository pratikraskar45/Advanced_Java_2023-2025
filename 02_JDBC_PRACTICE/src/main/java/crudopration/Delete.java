package crudopration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/company";
		String user="postgres";
		String pass="root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			Connection c= DriverManager.getConnection(url,user,pass);
			Statement s =c.createStatement();
			String query="Delete FROM employee WHERE eid=3";
			s.execute(query);
			c.close();
			System.out.println("Delte the data");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
