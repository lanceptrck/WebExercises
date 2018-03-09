package com.orangeandbronze.webdev.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Users
 */
@WebServlet("/users")
public class Users extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request,
	        HttpServletResponse response)
	        throws ServletException, IOException {
	    String firstname = request.getParameter("firstname");
	    String lastname = request.getParameter("lastname");
	    String email = request.getParameter("email");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<h2>You have registered!</h2>");
	    out.println("<p>First Name: " + firstname);
	    out.println("<p>Last Name: " + lastname);
	    out.println("<p>Email Address: " + email);
	}

}
