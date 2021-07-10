package com.Google;

import static org.testng.Assert.expectThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDVCConnections {

	public static void main(String[] args)  {

		// step 1: Register a jdvc driver 
		
		// Add mysql jar files to the library otherwise it will throw no class found exceptions
		
		Connection con=null;
		try {
			
		// copy from open source 
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver is registered with sql");
		
		// step 2: establish a connecton
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr","root","Aj251289");
		
		
		if(con!=null) 
			
			System.out.println("Connection established");

			
		else 
			System.out.println("connection is not established");
		
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		
		finally {
			
		if(con!=null)
			try {
				
				System.out.println("closing the connection");
				
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
			
		}
		
				
			
			
		
		
		
		
		
		
		
	}

}
