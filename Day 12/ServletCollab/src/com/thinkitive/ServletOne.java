package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();
		out.println("ServletOne output:");
		String eid = request.getParameter("usereid");
		String ename = request.getParameter("username");
		out.println(eid + " "+ ename);
		
		//Response Redirection - only redirect no sharing data
//		response.sendRedirect("ServletTwo");
		
		//RequestDispatcher
		RequestDispatcher req = request.getRequestDispatcher("ServletTwo");
		//calls and shares data with ServletTwo nd prints data of ServletTwo only
		req.forward(request, response);
		//calls and shares data with ServletTwo nd prints data of both ServletOne nd ServletTwo.
//		req.include(request, response);
		
	}

}
