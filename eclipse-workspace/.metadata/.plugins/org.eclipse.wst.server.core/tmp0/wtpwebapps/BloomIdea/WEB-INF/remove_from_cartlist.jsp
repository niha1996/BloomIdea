<%@page import="com.dao.CartlistDao"%>
<% int wid=Integer.parseInt(request.getParameter("wid"));
   CartlistDao.removefromCartlist(wid);
   response.sendRedirect("mycart.jsp");
 %>