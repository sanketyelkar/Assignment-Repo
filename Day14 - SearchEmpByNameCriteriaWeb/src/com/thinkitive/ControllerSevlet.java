package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;

@WebServlet("/control")
public class ControllerSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MyDbConnection db;

    public ControllerSevlet() {
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
		String empparam = request.getParameter("empparam");
		String opr = request.getParameter("opr");
		List<Employee> l = null;
		
		if(opr.equals("1")) {
			l = db.searchEmployee(Integer.parseInt(empparam));
		}else if(opr.equals("2")) {
			l = db.searchEmployee(empparam);
		}else if(opr.equals("3")){
			l = db.searchEmployee(Integer.parseInt(empparam), true);
		}
		request.setAttribute("employeeList", l);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
