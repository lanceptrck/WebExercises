package com.orangeandbronze.webdev.controllers;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.orangeandbronze.webdev.service.*;

@WebServlet("/products")
public class Products extends HttpServlet {
	
	private final ProductCatalogService productCatalogService = new ProductCatalogService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<List<String>> productList = productCatalogService.listProducts();
		
		// TODO set the productList object as the request attribute 'reportContent'
		
		request.getRequestDispatcher("report_table").forward(request, response);
	}

}
