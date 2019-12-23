package org.controller.admin.roler_manage.query;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.IAdminDao;
import org.dao.impl.AdminDaoImpl;
import org.entity.Admin;
import org.util.Page;

/**
 * Servlet implementation class queryadminByPageServlet
 */
@WebServlet("/queryadminByPageServlet")
public class queryadminByPageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    IAdminDao admindao=new AdminDaoImpl();
		
		Page p=new Page();
		String cPage=request.getParameter("currentPage");
		
		if(cPage==null) {
			cPage="1";
		}
		int currentPage=Integer.parseInt(cPage);
		System.out.println("1111**"+currentPage);
		p.setCurrentPage(currentPage);//获取页码int currentPage=2;
		
		int pageSize=5;//页面大小
		p.setPageSize(pageSize);
		
		int totalCount=admindao.getTotalCount();//数据总数
		p.setTotalCount(totalCount);
		System.out.println("2222**"+totalCount);
		
		
		
		List<Admin> admins=admindao.queryAdminByPage(currentPage, pageSize);
		System.out.println("3333**"+admins);	
		
		
		p.setAdmins(admins);
		request.setAttribute("p", p);
		request.getRequestDispatcher("web/admin/role_mange/query/queryadminByPage.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
