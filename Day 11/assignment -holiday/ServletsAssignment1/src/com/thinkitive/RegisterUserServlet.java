package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/register")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DbOperations db;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	this.db = new DbOperations();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("registerusername");
		String email = request.getParameter("registeruseremail");
		String contact = request.getParameter("registerusercontact");
		String password = request.getParameter("registeruserpassword");
//		out.println(name+" "+email+" "+contact+" "+password);
	
		try {
			if(this.db.insert(name, email, contact, password) > 0)
				response.sendRedirect("ProductsBootstrap.html");
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("RegistrationFailed.html");
		} catch (IOException e) {
			e.printStackTrace();
			response.sendRedirect("RegistrationFailed.html");
		}
	}

}
