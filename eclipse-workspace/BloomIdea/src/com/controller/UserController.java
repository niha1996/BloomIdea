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

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("signup"))
		{
			boolean flag=UserDao.checkEmail(request.getParameter("email"));
			if(flag==true)
			{
				if(request.getParameter("password").equals(request.getParameter("confirmpassword")))
				{
			User u=new User();
			u.setUsertype(request.getParameter("usertype"));
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setPhone(request.getParameter("mobile"));
			u.setCompanyname(request.getParameter("companyname"));
			u.setPassword(request.getParameter("password"));
			u.setConfirmpassword(request.getParameter("confirmpassword"));
			
			UserDao.insertContact(u);
			response.sendRedirect("signin.jsp");
			}
				else
				{
					request.setAttribute("msg", "Password and Confirm Password does not match");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
			}
			else 
			{
				request.setAttribute("msg", "Email Id Already Registered");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("signin"))
		{
			User u=UserDao.checkLogin(request.getParameter("email"), request.getParameter("password"));
			if(request.getParameter("email").equalsIgnoreCase("")|| request.getParameter("password").equalsIgnoreCase(""))
			{
				request.setAttribute("error","Email or Password Missing");
				request.getRequestDispatcher("signin.jsp").forward(request, response);
			}
			else if(u==null)
			{
				request.setAttribute("error","Email or Password is Incorrect");
				request.getRequestDispatcher("signin.jsp").forward(request, response);
			}
			else
			{
				if(u.getUsertype().equalsIgnoreCase("user"))
				{
				HttpSession session=request.getSession();
				session.setAttribute("u",u);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				
				else if (u.getUsertype().equalsIgnoreCase("admin"))
						{
					HttpSession session=request.getSession();
					session.setAttribute("u",u);
					request.getRequestDispatcher("admin_index.jsp").forward(request, response);
						}
					
						}
		}
	}
	
}

