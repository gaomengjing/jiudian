package org.dao;

import java.util.List;

import org.entity.Room;

public interface IRoomDao {
	public boolean addRoom(Room room);
	public boolean updateRoom(int rom_id,Room room);
	public boolean deleteRoom(int rom_id);
	
	public  List<Room> queryAllRoom() ;
	public  List<Room> queryRoombystatus();
	public  List<Room> queryRoomLiketype(String rom_type);
}
