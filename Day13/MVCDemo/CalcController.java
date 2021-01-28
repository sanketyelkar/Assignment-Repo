package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calccontrol")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalcController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Integer num1 = Integer.parseInt(request.getParameter("num1"));
		Integer num2 = Integer.parseInt(request.getParameter("num2"));
		String operation = request.getParameter("operation");

		Calculator calc = new Calculator();
		Double res = 0d;

		if (operation.equals("Add")) {
			res = calc.add(num1, num2);
			request.setAttribute("result", res);
		} else if (operation.equals("Subtract")) {
			res = calc.minus(num1, num2);
			request.setAttribute("result", res);
		} else if (operation.equals("Multiply")) {
			res = calc.multiply(num1, num2);
			request.setAttribute("result", res);
		} else if (operation.equals("Divide")) {
			Double ress = calc.div(num1, num2);
			request.setAttribute("result", ress);
		}

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
