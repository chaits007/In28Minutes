package com.chaitanya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserValidationService userValidationService = new UserValidationService();
	final static Logger logger = LoggerFactory.getLogger(LoginServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws java.io.IOException, ServletException {

		// String name = request.getParameter("name");
		// request.setAttribute("name", name);
		// request.setAttribute("name", request.getParameter("name"));

		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In doPost");
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (userValidationService.validateUser(name, password)) {
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("name", name);
			request.setAttribute("message", "Invalid Username/Password!");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}

	}

}
