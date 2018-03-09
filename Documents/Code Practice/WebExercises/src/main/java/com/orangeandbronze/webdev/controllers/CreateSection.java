package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/create_section")
public class CreateSection extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Create Section</title></head>");
        out.println("<body><h1>Create Section</h1>");
        out.println("<form action='sections' method='post'>");
		
		// TODO: Code from other web components to be placed here.
        request.getRequestDispatcher("/subjects").include(request, response);
        request.getRequestDispatcher("/schedules").include(request, response);
        request.getRequestDispatcher("/faculty").include(request, response);
        request.getRequestDispatcher("/rooms").include(request, response);
        request.getRequestDispatcher("/submit.txt").include(request, response);
        
        out.println("</form></body></html>");

	}

}
