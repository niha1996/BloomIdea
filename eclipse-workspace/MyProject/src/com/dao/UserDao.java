package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;
import com.util.EcomUtil;

public class UserDao {

	public static void insertUser(User u)
	{
		try {
			Connection conn=EcomUtil.createConnection();
			String sql="insert into user(fname,lname,email,mobile,address,password,cpassword) values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getPassword());
			pst.setString(7, u.getCpassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static User checkLogin(String email,String password)
	{
		System.out.println("Dao Called");
		User u=null;
		try {
			Connection conn=EcomUtil.createConnection();
			String sql="select * from user where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			System.out.println(email);
			System.out.println(password);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getString("mobile"));
				u.setPassword(rs.getString("password"));
				u.setCpassword(rs.getString("cpassword"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}
