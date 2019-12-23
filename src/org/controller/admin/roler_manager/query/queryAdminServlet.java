package org.controller.admin.roler_manager.query;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.IAdminDao;
import org.dao.impl.AdminDaoImpl;
import org.entity.Admin;


/**
 * Servlet implementation class queryAdminservlet
 */
@WebServlet("/queryAdminServlet")
public class queryAdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session=request.getSession();
		
		int adm_tel=(int)session.getAttribute("adm_tel");

		IAdminDao admindao=new AdminDaoImpl();

		List<Admin> list=admindao.queryAdminBytel(adm_tel);
		System.out.println("***"+list);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("web/admin/role_manager/query/adminInformation.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
