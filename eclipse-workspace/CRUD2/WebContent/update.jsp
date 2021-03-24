<%@page import="com.bean.User"%>
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
	User u=(User)request.getAttribute("u");
%>
<form name="insert" method="post" action="Servlet">
	<table cellspacing="5" cellpadding="5">
		<tr>
			<td><input type="hidden" name="id" value="<%=u.getId()%>"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=u.getFname()%>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%=u.getLname()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=u.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" value="<%=u.getMobile()%>"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea cols="22" rows="5" name="address"><%=u.getAddress() %></textarea></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<%
					if(u.getGender().equalsIgnoreCase("male"))
					{
				%>
						<input type="radio" name="gender" value="male" checked="checked">Male
						<input type="radio" name="gender" value="female">Female
				<%
					}
					else
					{
				%>
						<input type="radio" name="gender" value="male">Male
						<input type="radio" name="gender" value="female" checked="checked">Female
				<%		
					}
				%>
				
			</td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="<%=u.getPassword()%>"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update">
			</td>
		</tr>
	</table>
</form>

</body>
</html>