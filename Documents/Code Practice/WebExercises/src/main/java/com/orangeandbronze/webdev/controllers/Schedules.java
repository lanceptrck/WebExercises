package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/schedules")
public class Schedules extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Schedules</h2>");
		out.println("<input type='radio' name='schedule' value='MTH H0830'>MTH H0830");
		out.println("<input type='radio' name='schedule' value='TF H1000'>TF H1000");
		out.println("<input type='radio' name='schedule' value='WS H1130'>WS H1130");
	}

}
