package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;
import com.util.UserUtil;

public class UserDao {

	public static void insertUser(User u)
	{
		try {
			Connection conn=UserUtil.createConnection();
			String sql="insert into user(fname,lname,email,mobile,address,gender,password) values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getGender());
			pst.setString(7, u.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<User>getAllUser()
	{
		List<User>list=new ArrayList<User>();
		try {
			Connection conn=UserUtil.createConnection();
			String sql="select * from user";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getString("mobile"));
				u.setAddress(rs.getString("address"));
				u.setGender(rs.getString("gender"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		}
	public static User getUserById(int id)
	{
		User u=null;
				try {
					Connection conn=UserUtil.createConnection();
					String sql="select * from user where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1,id);
					ResultSet rs=pst.executeQuery();
					if(rs.next())
					{
						u=new User();
						u.setId(rs.getInt("Id"));
						u.setFname(rs.getString("fname"));
						u.setLname(rs.getString("lname"));
						u.setEmail(rs.getString("email"));
						u.setMobile(rs.getString("mobile"));
						u.setGender(rs.getString("gender"));
						u.setAddress(rs.getString("address"));
						u.setPassword(rs.getString("password"));
						
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return u;
	}
	public static void updateUser(User u)
	{
		try {
			Connection conn=UserUtil.createConnection();
			String sql="update user set fname=?,lname=?,email=?,mobile=?,address=?,gender=?,password=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getGender());
			pst.setString(7, u.getPassword());
			pst.setInt(8, u.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteUser(int id)
	{
		try
		{
			Connection conn=UserUtil.createConnection();
			String sql="delete from user where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	

