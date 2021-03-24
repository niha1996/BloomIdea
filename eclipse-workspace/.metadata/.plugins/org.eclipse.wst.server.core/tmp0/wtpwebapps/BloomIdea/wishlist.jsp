<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    
	int uid=Integer.parseInt(request.getParameter("uid"));
	int sid=Integer.parseInt(request.getParameter("sid"));
	WishlistDao.addToWishlist(uid, sid);
	response.sendRedirect("index.jsp");
%>
</body>
</html>