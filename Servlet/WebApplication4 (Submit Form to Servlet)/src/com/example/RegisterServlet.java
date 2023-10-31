package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/ResgisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<h2>Welcome to Register Servlet</h2>");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");

		String cond = request.getParameter("condition");
		if (cond != null) {
			if (cond.equals("checked")) {
				out.print("<h2>Name: " + name + "</h2>");
				out.print("<h2>Password: " + password + "</h2>");
				out.print("<h2>Email: " + email + "</h2>");
				out.print("<h2>Gender: " + gender + "</h2>");
				out.print("<h2>Course: " + course + "</h2>");
			} else {
				out.print("<h2>You have not accepted terms and conditions</h2>");
			}
		}
		else {
			out.print("<h2>You have not accepted terms and conditions</h2>");
	}

}
