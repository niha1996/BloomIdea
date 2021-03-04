package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Contact;
import com.util.CreateUtil;	

public class ContactDao {
	public static void insertContact(Contact c)
	{
		try
		{
		Connection conn=CreateUtil.createConnection();
		String sql="insert into contact(name,phone,subject,email,companyname,message)values(?,?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,c.getName());
		pst.setString(2, c.getPhone());
		pst.setString(3,c.getSubject());
		pst.setString(4, c.getEmail());
		pst.setString(5, c.getCompanyname());
		pst.setString(6, c.getMessage());
		pst.executeUpdate();
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
