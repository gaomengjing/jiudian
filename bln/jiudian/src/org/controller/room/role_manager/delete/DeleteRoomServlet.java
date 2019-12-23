package org.controller.room.role_manager.delete;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.dao.IRoomDao;
import org.dao.impl.RoomDaoImpl;
/**
 * Servlet implementation class DeleteRoomServlet
 */
@WebServlet("/DeleteRoomServlet")
public class DeleteRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param rom_id 
	 * @param rom_id 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	    HttpSession session=request.getSession();
//		int rom_id=(int)session.getAttribute("rom_id");
		int rom_id=Integer.parseInt(request.getParameter("rom_id")	);
		IRoomDao roomdao=new RoomDaoImpl();
		boolean result=roomdao.deleteRoom(rom_id);
		 if(result) {
	        	System.out.println("É¾³ý³É¹¦");
	        	response.sendRedirect("web/basic/main.jsp");
	        }else {
	        	System.out.println("É¾³ýÊ§°Ü");
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
