package com.orangeandbronze.webdev.controllers;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show_request_headers")
public class ShowRequestHeaders extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Servlet Example: Showing Request Headers";
	    out.println("<TITLE>" + title + "</TITLE>" +
	                "<B>Request Method: </B>" +
	                request.getMethod() + "<BR/>" +
	                "<B>Request URI: </B>" +
	                request.getRequestURI() + "<BR/>" +
	                "<B>Request Protocol: </B>" +
	                request.getProtocol() + "<BR/><BR/>" +
	                "<TABLE>" +
	                "<TH>Header Name<TH>Header Value");
	    Enumeration<String> headerNames = request.getHeaderNames();
	    while(headerNames.hasMoreElements()) {
	      String headerName = (String)headerNames.nextElement();
	      out.print("<TR><TD>" + headerName + "</TD>");
	      out.print("<TD>" + request.getHeader(headerName) + "</TD><TR>");
	    }
	    out.println("</TABLE>");
	    
	}

}
