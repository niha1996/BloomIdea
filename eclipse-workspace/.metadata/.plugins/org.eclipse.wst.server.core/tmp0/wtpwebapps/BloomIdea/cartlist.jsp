<%@page import="com.dao.ServiceDao"%>
<%@page import="com.bean.Service"%>
<%@page import="com.dao.CartlistDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<%
    
	int uid=Integer.parseInt(request.getParameter("uid"));
	int sid=Integer.parseInt(request.getParameter("sid"));
	Service s=ServiceDao.getServiceById(sid);
    long price =s.getPrice();
    CartlistDao.addToCartlist(uid,sid,price);
    
	response.sendRedirect("mycart.jsp");
%>
</body>
</html>