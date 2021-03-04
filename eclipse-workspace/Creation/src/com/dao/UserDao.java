package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Contact;
import com.bean.User;
import com.util.CreateUtil;

public class UserDao {
	public static void insertContact(User u)
	{
		try
		{
		Connection conn=CreateUtil.createConnection();
		String sql="insert into user(name,phone,Email,companyname,password,confirmpassword)values(?,?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,u.getName());
		pst.setString(2, u.getPhone());
		pst.setString(3,u.getEmail());
		pst.setString(4, u.getCompanyname());
		pst.setString(5, u.getPassword());
		
		pst.setString(6, u.getConfirmpassword());
		pst.executeUpdate();
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static User checkLogin(String email, String password)
	{
		
		User u=null;
		try
		{
			
			Connection conn=CreateUtil.createConnection();
			String sql="select * from user where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("mobile"));
				u.setCompanyname(rs.getString("companyname"));
				u.setPassword(rs.getString("password"));
				u.setConfirmpassword(rs.getString("confirmpassword"));
			}
		}
		catch(Exception e)
		{
	}
		return u;
}
}