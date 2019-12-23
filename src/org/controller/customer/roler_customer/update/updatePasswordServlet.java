package org.controller.customer.roler_customer.update;

import java.io.IOException;
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
 * Servlet implementation class updatePasswordServlet
 */
@WebServlet("/updatePasswordServlet")
public class updatePasswordServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cus_password=request.getParameter("cus_password");
		Customer customer=new Customer();
		customer.setCus_password(cus_password);
		HttpSession session=request.getSession();
		int cus_tel=(int)session.getAttribute("cus_tel");
		ICustomerDao customerdao=new CustomerDaoImpl();
        boolean result=customerdao.updatePassword(cus_tel, customer);
        
        if(result) {
        	System.out.println("修改成功！");
        	response.sendRedirect("web/basic/main.jsp");
        }else {
        	System.out.println("修改失败！");
        }
        
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
