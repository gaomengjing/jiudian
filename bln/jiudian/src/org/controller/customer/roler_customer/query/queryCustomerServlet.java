package org.controller.customer.roler_customer.query;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.ICustomerDao;
import org.dao.impl.CustomerDaoImpl;
import org.entity.Customer;

/**
 * Servlet implementation class queryCustomerServlet
 */
@WebServlet("/queryCustomerServlet")
public class queryCustomerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		int cus_tel=(int)session.getAttribute("cus_tel");

		ICustomerDao customerdao=new CustomerDaoImpl();

		List<Customer> list=customerdao.queryCustomerById(cus_tel);
		//System.out.println(list);
		
		request.setAttribute("list", list);
		 request.getRequestDispatcher("web/customer/role_customer/query/userInformatoin.jsp").forward(request, response);
		//response.sendRedirect("web/customer/userInformation.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
