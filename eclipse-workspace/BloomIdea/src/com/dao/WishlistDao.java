package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.CreateUtil;

public class WishlistDao {
	public static void addToWishlist(int uid, int sid) {
		try {
			Connection conn = CreateUtil.createConnection();
			String sql = "insert into wishlist(uid,sid)values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, sid);
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static List<Wishlist> getMyWishlist(int uid)
{
	List<Wishlist>list=new ArrayList<Wishlist>();
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="select * from wishlist where uid=?";
	    PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, uid);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Wishlist w=new Wishlist();
			w.setId(rs.getInt("id"));
			w.setUid(rs.getInt("uid"));
			w.setSid(rs.getInt("sid"));
			list.add(w);

		}
		
	}
catch(Exception e)
	{
		e.printStackTrace();
	}
	return list;
}
public static void removefromwishlist(int id)
{
	try
	{
		Connection conn=CreateUtil.createConnection();
		String sql="delete from wishlist where id=?";
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
