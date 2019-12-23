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

/**
 * Servlet implementation class queryAllAdminServlet
 */
@WebServlet("/queryAllAdminServlet")
public class queryAllAdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		IAdminDao admindao=new AdminDaoImpl();
		List<Admin> list=admindao.queryAllAdmins();
		request.setAttribute("list", list);
		request.getRequestDispatcher("web/admin/role_mange/query/queryAllAdmin.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
