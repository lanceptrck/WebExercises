package com.orangeandbronze.webdev.controllers;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils.*;

@WebServlet("/emails")
public class Emails extends HttpServlet {
	
	// Regular expression pattern for checking if valid email.
	private static Pattern validEmailAddress = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		if (validEmailAddress.matcher(email).matches()) {
			
			// set the email parameter in session
        // otherwise the parameter will be lost
        request.getSession().setAttribute("email", email);
        // redirect instead of forward
        response.sendRedirect("register_email");
        
		} else {
			// TODO: Forward to "invalid_email" URL
	        request.getRequestDispatcher("/invalid_email").forward(request, response);

		}
	}
}
