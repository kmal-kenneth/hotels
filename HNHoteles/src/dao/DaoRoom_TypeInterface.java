package dao;

import model.Room_Type;

import java.util.ArrayList;

public interface DaoRoom_TypeInterface {

    public ArrayList<Room_Type> getRoom_Type();
    public Room_Type getRoom_Type(int id_Room_Type);
    public void updateRoom_Type(Room_Type room_type);
    public void deleteRoom_Type(Room_Type room_type);
    public void addRoom_Type(Room_Type room_type);
}
