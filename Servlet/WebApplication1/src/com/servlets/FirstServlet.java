package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	//Life Cycle Methods:
	
	ServletConfig conf;
	
	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
		System.out.println("Creating Object.....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Servicing...........");
		
		//Set the content type of the response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>This is the output from service method</h1>");
		out.print("<h1>Today: date and time is "+new Date().toString()+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Going to destroy servlet object..........");
		
	}
	
	//Non Life Cycle methods:

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "This servlet is created by Aishwarya";
	}


	

}
