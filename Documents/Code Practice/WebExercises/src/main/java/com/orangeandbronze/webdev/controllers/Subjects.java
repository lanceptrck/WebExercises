package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/subjects")
public class Subjects extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Subjects</h2>");
		out.println("<input type='radio' name='subject' value='MATH17'>MATH17");
		out.println("<input type='radio' name='subject' value='COM1'>COM1");
		out.println("<input type='radio' name='subject' value='PE2'>PE2");
	}

}
