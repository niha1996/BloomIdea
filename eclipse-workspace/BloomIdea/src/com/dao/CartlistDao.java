package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cartlist;
import com.util.CreateUtil;

public class CartlistDao {
	public static void addToCartlist(int uid, int sid,long price) {
		try {
			Connection conn = CreateUtil.createConnection();
			String sql = "insert into Cartlist(uid,sid,price)values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, sid);
			pst.setLong(3, price);
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static List<Cartlist> getMyCartlist(int uid)
{
	List<Cartlist>list=new ArrayList<Cartlist>();
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="select * from Cartlist where uid=?";
	    PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, uid);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Cartlist w=new Cartlist();
			w.setId(rs.getInt("id"));
			w.setUid(rs.getInt("uid"));
			w.setSid(rs.getInt("sid"));
			w.setPrice(rs.getInt("price"));
			w.setNettotal(rs.getInt("netprice"));
			list.add(w);

		}
		
	}
catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
}
public static void removefromCartlist(int id)
{
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="delete from Cartlist where id=?";
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



