package com.orangeandbronze.webdev.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Renders a list of lists as an HTML table. Assumest that the first list contains the column headers. **/
@WebServlet("/report_table")
public class ReportTable extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// TODO: retrieve the 'reportContent' attribute via request.getAttribute(..) and set the 'reportContent' variable
		List<List<String>> reportContent = null; 
		
		if (reportContent.size() < 1) {
			throw new IllegalStateException("list is empty");
		}
		Iterator<List<String>> iterator = reportContent.iterator();
		out.println("<table>");
		// table headers
		out.print("<tr>");
		List<String> headers = iterator.next();
		for (String header : headers) {
			out.print("<th>" + header + "</th>");
		}
		out.print("</tr>");
		// table body
		while (iterator.hasNext()) {
			out.print("<tr>");
			List<String> row = iterator.next();
			for (String entry : row) {
				out.print("<td>" + entry + "</td>");
			}
			out.print("</tr>");
		}
		out.println("</table>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
