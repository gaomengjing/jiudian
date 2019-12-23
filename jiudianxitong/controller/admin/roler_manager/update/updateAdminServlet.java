package org.controller.admin.roler_manager.update;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.IAdminDao;
import org.dao.ICustomerDao;
import org.dao.impl.AdminDaoImpl;
import org.dao.impl.CustomerDaoImpl;
import org.entity.Admin;
import org.entity.Customer;

/**
 * Servlet implementation class updateAdminServlet
 */
@WebServlet("/updateAdminServlet")
public class updateAdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int adm_id=Integer.parseInt(request.getParameter("adm_id"));
        String adm_name=request.getParameter("adm_name");
        String adm_sex=request.getParameter("adm_sex");
        int adm_tel=Integer.parseInt(request.getParameter("adm_tel"));
        String adm_password=request.getParameter("adm_password");
        Admin admin=new Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password);
        System.out.println(admin);
        IAdminDao admindao=new AdminDaoImpl();
        boolean result=admindao.updateAdmin(adm_tel, admin);
        
        if(result) {
        	System.out.println("修改成功！");
        	response.sendRedirect("web/basic/main.jsp");
        }else {
        	System.out.println("修改失败！");
        }
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
