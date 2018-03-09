package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/rooms")
public class Rooms extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Rooms</h2>");
		out.println("<input type='radio' name='room' value='AVR1'>AVR1");
		out.println("<input type='radio' name='room' value='AS214'>AS214");
		out.println("<input type='radio' name='room' value='MEL314'>MEL314");
	}

}
