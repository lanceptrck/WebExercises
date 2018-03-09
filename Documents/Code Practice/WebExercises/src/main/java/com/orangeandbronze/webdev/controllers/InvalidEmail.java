package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/invalid_email")
public class InvalidEmail extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<span style='color:red'>Error: The email address you submitted - <strong>" + request.getParameter("email") + "</strong> - is invalid.</span>");
		out.println("<p>Please submit your email address again.</p>");
		request.getRequestDispatcher("/submit_email.html").include(request, response);
	}

}
