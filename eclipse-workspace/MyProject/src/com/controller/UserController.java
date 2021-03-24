package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.dao.UserDao;
import com.bean.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("signup"))
		{
			User u=new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(request.getParameter("mobile"));
			u.setAddress(request.getParameter("address"));
			u.setPassword(request.getParameter("password"));
			u.setCpassword(request.getParameter("cpassword"));
			UserDao.insertUser(u);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("login"))
		{
			User u=UserDao.checkLogin(request.getParameter("email"), request.getParameter("password"));
			if(request.getParameter("email").equalsIgnoreCase("") || request.getParameter("password").equalsIgnoreCase(""))
			{
				request.setAttribute("error", "Email Or Password Is Missing");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else if(u==null)
			{
				request.setAttribute("error", "Email Or Password Is Incorrect");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				HttpSession session=request.getSession();
				session.setAttribute("u", u);
				System.out.println("Session Id : "+session.getId());
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
	}

}
