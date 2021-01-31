package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayer")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HibernateConnection hc = new HibernateConnection();
		List<Dictionary> l = hc.displayAll();
		request.setAttribute("dictList", l);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

}
