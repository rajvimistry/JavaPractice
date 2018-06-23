package com.Customer.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Customer.Exception.CustomerException;
import com.Customer.Model.Customer;
import com.Customer.Service.CustomerServiceI;
import com.Customer.Service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerServiceI customerService = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerController() {
		super();
		customerService = new CustomerServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		RequestDispatcher dispatcher = null;
		String customerName = request.getParameter("customerName");
		String customerCity = request.getParameter("customerCity");
		String customerEmail = request.getParameter("customerEmail");
		Customer customer = new Customer();
		customer.setCustomerName(customerName);
		customer.setCustomerCity(customerCity);
		customer.setCustomerEmail(customerEmail);
		boolean regFlag;
		try {
			regFlag = customerService.SaveCustomer(customer);
			if (regFlag) {
				dispatcher = request.getRequestDispatcher("./success.jsp");
				dispatcher.forward(request, response);
			}
		} catch (CustomerBusinessException e) {
			String message = e.getMessage();
			// System.out.println("inside CustomerBusinessException: " + e.getMessage());
			request.setAttribute("message", message);
			dispatcher = request.getRequestDispatcher("./RegisterCustomer.jsp");
			dispatcher.forward(request, response);
			e.printStackTrace();
		} catch (CustomerException e) {
			String message = e.getMessage();
			request.setAttribute("message", message);
			dispatcher = request.getRequestDispatcher("./failure.jsp");
			dispatcher.forward(request, response);
			e.printStackTrace();
		}
	}

}
