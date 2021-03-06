package dao.interfaces;

import model.Room;

import java.util.ArrayList;

public interface DaoRoomInterface {

    public ArrayList<Room> getAllRoom();
    public Room getRoom(int id_Room);
    public void updateRoom(Room room);
    public void deleteRoom(Room room);
    public void addRoom(Room room);
}
