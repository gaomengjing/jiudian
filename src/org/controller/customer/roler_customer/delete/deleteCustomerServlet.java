package org.controller.customer.roler_customer.delete;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.ICustomerDao;
import org.dao.impl.CustomerDaoImpl;


@WebServlet("/deleteCustomerServlet")
public class deleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    HttpSession session=request.getSession();
			int cus_tel=(int)session.getAttribute("cus_tel");	
			ICustomerDao customerdao=new CustomerDaoImpl();
			boolean result=customerdao.deleteCustomer(cus_tel);
			 if(result) {
		        	System.out.println("删除成功！");
		        	response.sendRedirect("web/basic/main.jsp");
		        }else {
		        	System.out.println("删除失败！");
		        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
