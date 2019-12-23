package org.controller.customer.roler_customer.query;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class customerLoginServlet
 */
@WebServlet("/customerLoginServlet")
public class customerLoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cus_tel=Integer.parseInt((request.getParameter("cus_tel")).trim());
		String cus_password=request.getParameter("cus_password");
		System.out.println(cus_tel);
		System.out.println(cus_password);
		
    	
    	Customer customer=new Customer(cus_tel,cus_password);
    	//System.out.println("登录"+customer.toString());

    	ICustomerDao customerdao=new CustomerDaoImpl();
    	int result=customerdao.login(customer);
    	//System.out.println(result);
        response.setContentType("text/html; charset=utf-8");
 		response.setCharacterEncoding("utf-8");
    	if(result>0) {
    		System.out.println("登录成功！");
    		HttpSession session=request.getSession();
    		session.setAttribute("cus_tel",cus_tel);
    		//session.setAttribute("cus_password",cus_password);
    		response.sendRedirect("web/basic/main.jsp");
		} 
    	else {
    		System.out.println("登录失败！");
    		response.sendRedirect("web/customer/role_customer/query/userLogin.jsp");
    	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
