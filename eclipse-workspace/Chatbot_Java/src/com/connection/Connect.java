package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection connectConnection() {
	Connection conn=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tts_4_30","root","");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return conn;
		
}
}