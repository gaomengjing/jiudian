package org.controller.room.role_manager.insert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.IRoomDao;
import org.dao.impl.RoomDaoImpl;
import org.entity.Room;



/**
 * Servlet implementation class AddRoomServlet
 */
@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int rom_id=Integer.parseInt(request.getParameter("rom_id"));
        String rom_type=request.getParameter("rom_type");
        int rom_prise=Integer.parseInt(request.getParameter("rom_prise"));
        int adm_id=Integer.parseInt(request.getParameter("adm_id"));
        int rom_status=Integer.parseInt(request.getParameter("rom_status"));
        Room room=new Room(rom_id,rom_type,rom_prise,adm_id,rom_status);
        //
        IRoomDao roomdao=new RoomDaoImpl();
        boolean result=roomdao.addRoom(room);
        response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =response.getWriter();		
		if(result) { 			
			out.println("添加成功");
		}else {
			out.println("添加失败");
		}
		System.out.println(room);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
