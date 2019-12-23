package org.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dao.IRoomDao;
import org.entity.Room;
import org.util.DBmysql;
public class RoomDaoImpl implements IRoomDao {

//增加房间
	public boolean addRoom(Room room) {
		String sql="insert into room (rom_id,rom_type,rom_prise,adm_id,rom_status) values(?,?,?,?,?)";
		Object[] params= {room.getRom_id(),room.getRom_type(),room.getRom_prise(),room.getAdm_id(),room.getRom_status()};
		return DBmysql.executeUpdate(sql, params);
		
	}


//修改房间信息 by_romid
	public boolean updateRoom(int rom_id,Room room){
		String sql="update room set rom_id=?,rom_prise=?,rom_type=?,adm_id=?,rom_status=? where rom_id=?";
		Object[] params= {room.getRom_id(),room.getRom_prise(),room.getRom_type(),room.getAdm_id(),room.getRom_status(),rom_id};
		return DBmysql.executeUpdate(sql, params);
	}

//删除房间信息
	public boolean deleteRoom(int rom_id) {
		String sql="delete from room where rom_id=?";
		Object[] params= {rom_id};
		return DBmysql.executeUpdate(sql, params);
    }
//查找全部房间
	public  List<Room> queryAllRoom() {
	    PreparedStatement pstmt=null;
		ResultSet rs=null;
		Room room =null;
		
		List<Room> rooms=new ArrayList<Room>();
		 
		try {
			 String sql="select * from room ";
			 rs=DBmysql.executeQuery(sql, null);
			// rs=pstmt.executeQuery();
			 while(rs.next()){
				 int rom_id=rs.getInt("rom_id");
				 int rom_prise=rs.getInt("rom_prise");
				 String rom_type=rs.getString("rom_type");
				 int adm_id=rs.getInt("adm_id");
				 int rom_status=rs.getInt("rom_status");
				 room=new Room(rom_id,rom_type,rom_prise,adm_id,rom_status);
				
				 rooms.add(room);
				 System.out.println(room);
			 }
			 return rooms;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBmysql.closeAll(rs,pstmt,DBmysql.connection);
		}
	}
	
//用户查找房间by_status
	public  List<Room> queryRoombystatus() {
	    PreparedStatement pstmt=null;
		ResultSet rs=null;
		Room room =null;
		
		List<Room> rooms=new ArrayList<Room>();
		 
		try {
			 String sql="select * from room where rom_status=0";
			 rs=DBmysql.executeQuery(sql, null);
			// rs=pstmt.executeQuery();
			 while(rs.next()){
				 int rom_id=rs.getInt("rom_id");
				 int rom_prise=rs.getInt("rom_prise");
				 String rom_type=rs.getString("rom_type");
				 int adm_id=rs.getInt("adm_id");
				 int rom_status=rs.getInt("rom_status");
				 room=new Room(rom_id,rom_type,rom_prise,adm_id,rom_status);
				
				 rooms.add(room);
				 System.out.println(room);
			 }
			 return rooms;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBmysql.closeAll(rs,pstmt,DBmysql.connection);
		}
	}
//用户模糊查询by_type
	public  List<Room> queryRoomLiketype(String rom_type) {
	    PreparedStatement pstmt=null;
		ResultSet rs=null;
		Room room =null;
		
		List<Room> rooms=new ArrayList<Room>();
		 
		try {
			 String sql="select * from room where rom_status=0 and rom_type=?";
			 rs=DBmysql.executeQuery(sql, null);
			// rs=pstmt.executeQuery();
			 while(rs.next()){
				 int rom_id=rs.getInt("rom_id");
				 int rom_prise=rs.getInt("rom_prise");
				 String rom_types=rs.getString("rom_type");
				 int adm_id=rs.getInt("adm_id");
				 int rom_status=rs.getInt("rom_status");
				 room=new Room(rom_id,rom_type,rom_prise,adm_id,rom_status);
				
				 rooms.add(room);
				 System.out.println(room);
			 }
			 return rooms;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBmysql.closeAll(rs,pstmt,DBmysql.connection);
		}
	}
	
	
	

}
