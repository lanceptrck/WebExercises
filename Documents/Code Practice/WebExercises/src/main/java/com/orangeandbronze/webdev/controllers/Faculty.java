package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/faculty")
public class Faculty extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Faculty</h2>");
		out.println("<input type='radio' name='faculty' value='Reyes'>Reyes");
		out.println("<input type='radio' name='faculty' value='Chua'>Chua");
		out.println("<input type='radio' name='faculty' value='Cagampan'>Cagampan");
	}

}
