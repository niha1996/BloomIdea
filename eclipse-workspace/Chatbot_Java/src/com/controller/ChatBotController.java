package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Chatbot;
import com.dao.ChatbotDao;

/**
 * Servlet implementation class ChatBotController
 */
@WebServlet("/ChatBotController")
public class ChatBotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println(action);
				if(action.equalsIgnoreCase("submit"))
				{
					Chatbot chatbot=new Chatbot();
				chatbot.setMessage(request.getParameter("message"));
				ChatbotDao.insert(chatbot);
				
				response.sendRedirect("chatbot.jsp");
					
				}
	}

}
