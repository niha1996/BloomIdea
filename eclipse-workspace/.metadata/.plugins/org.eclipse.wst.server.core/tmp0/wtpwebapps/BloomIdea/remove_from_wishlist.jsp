<%@page import="com.dao.WishlistDao"%>
<% int wid=Integer.parseInt(request.getParameter("wid"));
   WishlistDao.removefromwishlist(wid);
   response.sendRedirect("mywishlist.jsp");
 %>