package com.orangeandbronze.webdev.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/enlistment_controller")
public class EnlistmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EnlistmentController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Collection<String> sections = getEnlistedSections(request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<title>Enlisted sections</title>");
		out.println("<h2>You have enlisted the following sections:</h2>");
		if (sections.size() < 1) {
			out.println("<p>"+"You didn't enlist anything."+"</p>");
		} else {
			out.println("<ul>");
			for (String section : sections) {
				out.println("<li>" + section + "</li>");
			}
			out.println("</ul>");
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Collection<String> sections = getEnlistedSections(request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<title>Enlisted sections</title>");
		out.println("<h2>You have enlisted the following sections:</h2>");
		if (sections.size() < 1) {
			out.println("<p>"+"You didn't enlist anything."+"</p>");
		} else {
			out.println("<ul>");
			for (String section : sections) {
				out.println("<li>" + section + "</li>");
			}
			out.println("</ul>");
		}	
		
	}
	
	private Collection<String> getEnlistedSections(HttpServletRequest request){
		HttpSession session = request.getSession();
		
		Collection<String> sections = Arrays.asList(request.getParameterValues("section"));

		return sections;
		
	}

}
