package org.controller.admin.roler_manager.update;

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
 * Servlet implementation class selectUpdatePWServlet
 */
@WebServlet("/selectUpdatePWServlet")
public class selectUpdatePWServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    HttpSession session=request.getSession();
			int adm_tel=(int)session.getAttribute("adm_tel");
			IAdminDao admindao=new AdminDaoImpl();			
			List<Admin> list=admindao.queryAdminBytel(adm_tel);	
			request.setAttribute("list", list);
			request.getRequestDispatcher("web/admin/role_manager/update/updatePassword.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
