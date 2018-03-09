package com.orangeandbronze.webdev.controllers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.orangeandbronze.webdev.service.*;

@WebServlet("/sections/*")
public class Sections extends HttpServlet {
	
	private SectionManagementService service = new SectionManagementService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		if (pathInfo == null) {
			request.setAttribute("DTOs", service.findAllSectionDTOs());
			request.getRequestDispatcher("/WEB-INF/show_sections.jsp").forward(request, response);
		} else {
			SectionDTO dto = service.findSectionInfoById(pathInfo.substring(1));
			request.setAttribute("dto", dto);
			request.getRequestDispatcher("/WEB-INF/show_section.jsp").forward(request, response);
		}
	}
}
