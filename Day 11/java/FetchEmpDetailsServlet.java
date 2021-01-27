package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchEmpDetailsServlet
 */
@WebServlet("/FetchEmpDetailsServlet")
public class FetchEmpDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MyDbOperations db;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchEmpDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
		db = new MyDbOperations();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Get Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("usereid"));
		String ename = request.getParameter("username");
		int salary = Integer.parseInt(request.getParameter("usersalary"));
		
		this.db.insert(eid, ename, salary);
		List l = db.display();
//		out.println(request.getServletPath());
		for(Object s : l)
			out.println("<h1>"+s+"</h1><br />");
	}

}
