package org.controller.admin.roler_manager.insert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.IAdminDao;
import org.dao.impl.AdminDaoImpl;
import org.entity.Admin;

/**
 * Servlet implementation class addAdminServlet
 */
@WebServlet("/addAdminServlet")
public class addAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int adm_id=Integer.parseInt(request.getParameter("adm_id"));
		 String adm_name=request.getParameter("adm_name");
		 String adm_sex=request.getParameter("adm_sex");
		 int adm_tel=Integer.parseInt(request.getParameter("adm_tel"));
		 String adm_password=request.getParameter("adm_password");
		 Admin admin=new Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password);
		 IAdminDao admindao=new AdminDaoImpl();
		 boolean result=admindao.addAdmin(admin);
		 response.setContentType("text/html; charset=utf-8");
		 response.setCharacterEncoding("utf-8");
		 PrintWriter out =response.getWriter();	
		 if(result) {
			 System.out.println("添加成功！");
			 response.sendRedirect("web/admin/role_manager/query/adminLogin.jsp");
			 //out.println("增加成功！");/
		 }else {
			 System.out.println("添加失败！");
			 response.sendRedirect("web/admin/role_manager/insert/adminRegister.jsp");
			 //out.println("增加失败！");
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
