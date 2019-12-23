package org.controller.room.role_manager.query;

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
 * Servlet implementation class QueryAllroomServlet
 */
@WebServlet("/QueryAllroomServlet")
public class QueryAllroomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryAllroomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		IRoomDao roomDao=new RoomDaoImpl();
		List<Room> list=roomDao.queryAllRoom();
		System.out.println(list);
		  
		//System.out.println(list);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("web/room/role_manager/query/allroom.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
