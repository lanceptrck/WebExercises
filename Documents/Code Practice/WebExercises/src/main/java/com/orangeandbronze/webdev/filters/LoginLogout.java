package com.orangeandbronze.webdev.filters;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.Filter.*;

// TODO: Add @WebFilter annotation, and map to "/hello" URL path
@WebFilter("/hello")
public class LoginLogout implements Filter{ // TODO: Class must implement Filter interface

	private final static String USERNAME = "username";

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)	throws IOException, ServletException {
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		  String usernameSessionAttr = (String)session.getAttribute(USERNAME);
		  if (usernameSessionAttr == null) { // not logged-in
		    String usernameParam = request.getParameter(USERNAME);
		    if (usernameParam == null) { // go to login page
		      ((HttpServletRequest) request).getRequestDispatcher(
		            "/WEB-INF/login.jsp").forward(request, response);
		    } else {
		      session.setAttribute(USERNAME, usernameParam);
		    }
		  }
		
		chain.doFilter(request, response);
		
		if (session.getAttribute(USERNAME) != null) { // is logged-in
			  ((HttpServletRequest) request).getRequestDispatcher(
			        "/WEB-INF/footer.jsp").include(request, response);
			}
	}

	public void destroy() {
		// do nothing
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// do nothing
	}

}
