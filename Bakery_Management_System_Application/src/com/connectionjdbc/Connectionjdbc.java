package com.connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionjdbc {
	
	static Connection con;

	public static Connection createC()
	{
		
		
		try {
			//load the driver class 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//create the connection...
			String user ="root";
			String password="anil";
			String url="jdbc:mysql://localhost:3306/Bakery_Management_System";
			
			
			con= DriverManager.getConnection(url,user,password);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return con;
	}

}
