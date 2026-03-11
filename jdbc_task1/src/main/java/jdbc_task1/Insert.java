package jdbc_task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		                                   
		
		
		//1-load or register the driver(string class name) 
		Class.forName("com.mysql.cj.jdbc.Driver");   // string class name
		
		
		
	  //2-establish connection (java.sql package import)
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");   //java.sql pakcage import
		
	
		
		
		//3-create statement
		Statement statement=connection.createStatement();//import from java.sql and connection reference
		
		
		
		
		//4-Execute Statement 
		statement.execute("insert into student values (15,'Vishal',99)"); // reference for statement
		
		
		
		//5-close connection
		connection.close();  //connection reference
		
	
		
		System.out.println("inserted");
		
	}
	

}
  