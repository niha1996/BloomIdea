<%@page import="com.bean.User"%>
<%@page import="java.util.List"%>
<%@page import="com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%" cellspacing="5" cellpadding="5">
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Address</th>
<th>Gender</th>
<th>Password</th>
<th>Edit</th>
<th>Delete</th>
</tr>
 <%
List<User> list=UserDao.getAllUser();
for(User u:list)
{
%>
<tr>
<td><%=u.getId()%></td> 
<td><%=u.getFname()%></td>
<td><%=u.getLname()%></td>
<td><%=u.getEmail()%></td>
<td><%=u.getMobile()%></td>
<td><%=u.getAddress()%></td>
<td><%=u.getGender()%></td>
<td><%=u.getPassword()%></td>
<td>
<form name="edit" method="post" action="Servlet">
<input type ="hidden" name="id" value="<%=u.getId() %>">
<input type="submit" name="action" value="Edit">
</form>
</td>
<td>
<form name="delete" method="post" action="Servlet">
<input type ="hidden" name="id" value="<%=u.getId() %>">
<input type="submit" name="action" value="Delete">
</form>
</td>
</tr>
<%
}
%>
</table>
<a href="index.jsp">Add New User</a>
</body>
</html>