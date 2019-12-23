package org.controller.admin.roler_manager.query;

import java.io.IOException;
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
 * Servlet implementation class queryAdminLoginServlet
 */
@WebServlet("/queryAdminLoginServlet")
public class queryAdminLoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adm_tel=Integer.parseInt(request.getParameter("adm_tel"));
		String adm_password=request.getParameter("adm_password");
		Admin admin=new Admin(adm_tel,adm_password);
		IAdminDao admindao=new AdminDaoImpl();
		int result=admindao.login(admin);
		if(result>0) {
			System.out.println("登录成功！");
    		HttpSession session=request.getSession();
    		session.setAttribute("adm_tel",adm_tel);
    		response.sendRedirect("web/admin/leftmenue/adminmain.jsp");
		}else {
			System.out.println("登录失败！");
    		response.sendRedirect("web/admin/role_admin/query/adminLogin.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
