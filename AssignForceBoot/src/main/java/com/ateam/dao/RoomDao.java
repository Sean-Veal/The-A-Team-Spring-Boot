package com.ateam.dao;

import org.springframework.stereotype.Repository;

import com.ateam.beans.Room;

@Repository
public interface RoomDao extends BaseRepository<Room, Integer>{

	public Room findRoomByRoomName(String roomName);

}
