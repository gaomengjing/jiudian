package org.controller.admin.roler_manager.delete;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.IAdminDao;
import org.dao.ICustomerDao;
import org.dao.impl.AdminDaoImpl;
import org.dao.impl.CustomerDaoImpl;

/**
 * Servlet implementation class deleteAdminServlet
 */
@WebServlet("/deleteAdminServlet")
public class deleteAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    HttpSession session=request.getSession();
			int adm_tel=(int)session.getAttribute("adm_tel");
			IAdminDao admindao=new AdminDaoImpl();
			boolean result=admindao.deleteAdmin(adm_tel);
			 if(result) {
		        	System.out.println("删除成功！");
		        	response.sendRedirect("web/basic/main.jsp");
		        }else {
		        	System.out.println("删除失败！");
		        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
