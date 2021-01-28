package com.thinkitive;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controlservlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MyDbConnection db;

    public ControllerServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
    	super.init();
    	db = new MyDbConnection();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String operation = request.getParameter("operation");
		
		if(operation.equals("Insert")) {
			db.insertEmployee(eid, ename, salary);
			response.sendRedirect("showservlet");
		}else if(operation.equals("Update")) {
			db.updateEmployee(eid, ename, salary);
			response.sendRedirect("showservlet");
		}else if(operation.equals("Delete")) {
			db.deleteEmployee(eid, ename, salary);
			response.sendRedirect("showservlet");
		}
		
		
		
		
	}

}
