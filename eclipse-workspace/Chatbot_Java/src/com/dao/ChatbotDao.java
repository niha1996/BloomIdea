package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Chatbot;
import com.connection.Connect;

public class ChatbotDao {
public static void insert(Chatbot chatbot)
{
	try
	{
		Connection conn=Connect.connectConnection();
		String sql="insert into chatbot(message)values(?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,chatbot.getMessage());
			pst.executeUpdate();
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
