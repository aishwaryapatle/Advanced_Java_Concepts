package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("This is get method...........");

		// Set the content type of the response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>This is the output from HttpServlet's get method</h1>");
		out.print("<h3>Today: date and time is " + new Date().toString() + "</h3>");
	}
	
	

}
