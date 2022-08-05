package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection con=null;
	
	

	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
			//step2 create  the connection object 
			 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmanagement","root","88888888");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con;
	}
	
}