package org.controller.customer.roler_manager.query;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.ICustomerDao;
import org.dao.impl.CustomerDaoImpl;
import org.entity.Customer;

/**
 * Servlet implementation class queryAllCustomerServlet
 */
@WebServlet("/queryAllCustomerServlet")
public class queryAllCustomerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ICustomerDao customerdao=new CustomerDaoImpl();
		List<Customer> list=customerdao.queryAllCustomers();
		System.out.println("list**"+list);
		request.setAttribute("list", list);
		request.getRequestDispatcher("web/customer/role_manager/query/queryAllCustomer.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
