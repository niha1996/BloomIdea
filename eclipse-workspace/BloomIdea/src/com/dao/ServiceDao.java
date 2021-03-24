package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Service;

import com.util.CreateUtil;



public class ServiceDao {
public static void addServices(Service s)
{
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="insert into service(service_name,about,price,image)values(?, ?, ?, ?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1, s.getSrvicename());
		pst.setString(2, s.getAbout());
		pst.setLong(3, s.getPrice());
		pst.setString(4, s.getImage());
		pst.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
}
public static List<Service> getAllServices()
{
	List<Service>list=new ArrayList<Service>();
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql= "select * from service";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Service s=new Service();
			s.setId(rs.getInt("id"));
			s.setSrvicename(rs.getString("service_name"));
			s.setPrice(rs.getLong("price"));
			s.setAbout(rs.getString("about"));
			s.setImage(rs.getString("image"));
			list.add(s);
			
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
}
public static Service getServiceById(int id)
{
	Service s=null;
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql= "select * from service where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1,id);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			s=new Service();
			s.setId(rs.getInt("id"));
			s.setSrvicename(rs.getString("service_name"));
			s.setPrice(rs.getLong("price"));
			s.setImage(rs.getString("image"));
			s.setAbout(rs.getString("about"));
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	} 
	return s;
}
public static void editservices(Service s)
{
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="update Service set service_name=?,price=?,image=?,about=? where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,s.getSrvicename());
		pst.setLong(2, s.getPrice());
		pst.setString(3, s.getImage());
		pst.setString(4, s.getAbout());
		pst.setInt(5, s.getId());
		pst.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void deleteservice(int id)
{
	try {
		Connection conn=CreateUtil.createConnection();
		String sql="delete from service where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
