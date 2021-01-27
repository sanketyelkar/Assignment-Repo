package com.thinkitive;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at getlogin: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String pass = request.getParameter("userpassword");
		
		
		if(pass.equals("admin") && name.equals("admin")) {
//			Cookie ck = new Cookie("sessionid","306");
//			response.addCookie(ck);
		
//			RequestDispatcher rd = request.getRequestDispatcher("ImportantPage?sessionid=123456");
//			rd.forward(request, response);
			response.sendRedirect("ImportantPage?sessionid=306");
		}
		else if(pass.equals("sanket") && name.equals("sanket")) {
			response.sendRedirect("ImportantPage?sessionid=1234");
		}
		else
			out.println("Incorrect username or password");
	}

}
