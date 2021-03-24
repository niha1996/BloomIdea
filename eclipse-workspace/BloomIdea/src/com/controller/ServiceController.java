package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.Service;
import com.dao.ServiceDao;

@WebServlet("/ServiceController")
@MultipartConfig(fileSizeThreshold= 1024*1024*512, maxFileSize =1024*1024*512,maxRequestSize=1024*1024*512)
public class ServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String extractfilename(Part file) {
		String cd=file.getHeader("content-disposition");
		System.out.println(cd);
		String [] items=cd.split(";");
		for(String string :items) {
			if(string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2,string.length()-1);
			}
		}
		return "";
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	if(action.equalsIgnoreCase("Add_Services"))
	{
		String savePath="C:\\Users\\Hp\\eclipse-workspace\\BloomIdea\\WebContent\\upload";
		File fileSaveDir=new File(savePath);
		if(!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
		}
		Part file1=request.getPart("image");
		System.out.println(file1);
		String filename=extractfilename(file1);
		file1.write(savePath + File.separator + filename);
		String filePath=savePath + File.separator +filename;
		String savePath2="C:\\Users\\Hp\\eclipse-workspace\\BloomIdea\\WebContent\\upload";
		File imageSaveDir=new File(savePath2);
	    if(!imageSaveDir.exists()) {
	    	imageSaveDir.mkdir();
	    }
	    Service s=new Service();
	    s.setSrvicename(request.getParameter("servicename"));
	    s.setPrice(Long.parseLong(request.getParameter("price")));
	    s.setAbout(request.getParameter("about"));
	    s.setImage(filename);
	    ServiceDao.addServices(s);
	    response.sendRedirect("admin_index.jsp");
	    }
	else if(action.equalsIgnoreCase("Edit_Services"))
	{
		String savePath="C:\\Users\\Hp\\eclipse-workspace\\BloomIdea\\WebContent\\upload";
		File fileSaveDir=new File(savePath);
		if(!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
		}
		Part file1=request.getPart("image");
		String filename=extractfilename(file1);
		file1.write(savePath + File.separator + filename);
		String filePath=savePath + File.separator +filename;
		String savePath2="C:\\Users\\Hp\\eclipse-workspace\\BloomIdea\\WebContent\\upload";
		File imageSaveDir=new File(savePath2);
	    if(!imageSaveDir.exists()) {
	    	imageSaveDir.mkdir();
	    }
	    System.out.println(filename);
	    Service s=new Service();
	    s.setId(Integer.parseInt(request.getParameter("id")));
	    s.setSrvicename(request.getParameter("servicename"));
	    s.setPrice(Long.parseLong(request.getParameter("price")));
	    s.setAbout(request.getParameter("about"));
	    s.setImage(filename);
	    ServiceDao.editservices(s);
	    response.sendRedirect("admin_view_services.jsp");
	    }
	else if(action.equalsIgnoreCase(("Delete_Services")))
			{
	      ServiceDao.deleteservice(Integer.parseInt(request.getParameter("id")));
		  response.sendRedirect("admin_view_services.jsp");
			}
	}
	}


