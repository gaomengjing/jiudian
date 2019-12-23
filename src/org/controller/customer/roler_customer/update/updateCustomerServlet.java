package org.controller.customer.roler_customer.update;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.ICustomerDao;
import org.dao.impl.CustomerDaoImpl;
import org.entity.Customer;


@WebServlet("/updateCustomerServlet")
public class updateCustomerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cus_id=request.getParameter("cus_id");
        String cus_name=request.getParameter("cus_name");
        String cus_sex=request.getParameter("cus_sex");
        int cus_age=Integer.parseInt(request.getParameter("cus_age"));
        int cus_tel=Integer.parseInt(request.getParameter("cus_tel"));
        String cus_password=request.getParameter("cus_password");
        
        Customer customer=new Customer(cus_id,cus_name,cus_sex,cus_age,cus_tel,cus_password);
        System.out.println(customer);
        ICustomerDao customerdao=new CustomerDaoImpl();
        boolean result=customerdao.updateCustomer(cus_id, customer);
        
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
