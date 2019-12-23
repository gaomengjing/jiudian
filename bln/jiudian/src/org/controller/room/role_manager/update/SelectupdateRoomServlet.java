package org.controller.room.role_manager.update;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.dao.IRoomDao;
import org.dao.impl.RoomDaoImpl;
import org.entity.Room;

/**
 * Servlet implementation class SelectupdateRoomServlet
 */
@WebServlet("/SelectupdateRoomServlet")
public class SelectupdateRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectupdateRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IRoomDao roomdao=new RoomDaoImpl();
		List<Room> list=roomdao.queryAllRoom() ;	
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("web/room/role_manager/update/updateroom.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
