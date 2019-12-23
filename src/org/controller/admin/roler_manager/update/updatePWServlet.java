package org.controller.admin.roler_manager.update;

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
 * Servlet implementation class updatePWServlet
 */
@WebServlet("/updatePWServlet")
public class updatePWServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adm_password=request.getParameter("adm_password");
		//System.out.println(adm_password);
		Admin admin=new Admin();		
		admin.setAdm_password(adm_password);
		HttpSession session=request.getSession();
		int adm_tel=(int)session.getAttribute("adm_tel");
		//System.out.println(adm_tel);
		IAdminDao admindao= new AdminDaoImpl();
        boolean result=admindao.updatePassword(adm_tel, admin);

        if(result) {
        	System.out.println("修改成功！");
        	response.sendRedirect("web/basic/main.jsp");
        }else {
        	System.out.println("修改失败！");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
