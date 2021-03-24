<%
	session.removeAttribute("u");
	session.invalidate();
	response.sendRedirect("signin.jsp");
%>