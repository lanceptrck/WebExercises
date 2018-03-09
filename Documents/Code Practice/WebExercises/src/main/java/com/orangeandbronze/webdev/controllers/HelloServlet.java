package com.orangeandbronze.webdev.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	        throws ServletException, IOException{
	    res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	    out.println("<H1>Hello World!</H1>");
	}
}