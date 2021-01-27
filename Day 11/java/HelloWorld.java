package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/hellofile") // this is just a name for our file,for security reasons change it to smthngelse
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int visitCount;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init started..");
		this.visitCount = 0;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("Ur Visit Count is " + this.visitCount++);
		
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String pass = request.getParameter("userpassword");
		out.println();
		out.println(user+" "+pass);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		response.getWriter().println("doPost started..");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String pass = request.getParameter("userpassword");
		out.println();
		out.println(user+" "+pass);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroy started..");
	}

}
