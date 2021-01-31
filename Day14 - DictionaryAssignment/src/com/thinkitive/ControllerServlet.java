package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dictionarycontroller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operation = request.getParameter("operation");
		HibernateConnection hc = new HibernateConnection();
		
		if(operation.equals("1")) {
			String word = request.getParameter("word");
			String means = request.getParameter("means");
			hc.addWord(word, means);
			response.sendRedirect("displayer");
		}else if(operation.equals("2")) {
			String word = request.getParameter("word");
			List<Dictionary> l = hc.searchWord(word);
			request.setAttribute("dictList", l);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}else if(operation.equals("3")) {
			String word = request.getParameter("word");
			hc.deleteWord(word);
			response.sendRedirect("displayer");
		}
	}

}
