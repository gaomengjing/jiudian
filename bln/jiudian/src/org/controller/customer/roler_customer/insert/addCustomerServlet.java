package org.controller.customer.roler_customer.insert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.ICustomerDao;
import org.dao.impl.CustomerDaoImpl;
import org.entity.Customer;

/**
 * Servlet implementation class addCustomerServlet
 */
@WebServlet("/addCustomerServlet")
public class addCustomerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cus_id=request.getParameter("cus_id");
        String cus_name=request.getParameter("cus_name");
        String cus_sex=request.getParameter("cus_sex");
        int cus_age=Integer.parseInt(request.getParameter("cus_age"));
        int cus_tel=Integer.parseInt(request.getParameter("cus_tel"));
        String cus_password=request.getParameter("cus_password");
        
        Customer customer=new Customer(cus_id,cus_name,cus_sex,cus_age,cus_tel,cus_password);
        //接口 x =new 实现类();
        ICustomerDao customerdao=new CustomerDaoImpl();
        boolean result=customerdao.addCustomer(customer);
        response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =response.getWriter();		
		if(result) { 			
			out.println("增加成功！");
		}else {
			out.println("增加失败！");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
