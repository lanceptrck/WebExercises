package com.orangeandbronze.webdev.controllers;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/carts")
public class Carts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("WEB-INF/cart_view.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Integer> cart = getCartFromSession(request);
		cart.put(request.getParameter("product"), Integer.valueOf(request.getParameter("quantity")));
		doGet(request, response);
	}

	private Map<String, Integer> getCartFromSession(HttpServletRequest request) {
		// TODO: Retrieve the HttpSession object
		HttpSession session = request.getSession();
		// TODO: Retrieve the 'cart' attribute from the session
		Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<>();
			
			// TODO: If there is no 'cart' attribute yet, set it
			session.setAttribute("cart", cart);
		}
		return cart;
	}

}
