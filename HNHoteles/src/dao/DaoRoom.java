package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoRoomInterface;
import model.Room;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoRoom implements DaoRoomInterface {
    @Override
    public ArrayList<Room> getAllRoom() {
        ArrayList<Room> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM room";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Room room = new Room(
                        rs.getInt("id"),
                        rs.getInt("id_season"),
                        rs.getInt("id_typeRoom"),
                        rs.getInt("id_hotel"),
                        rs.getString("name"),
                        rs.getFloat("price")
                );

                list.add(room);
            }

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Room getRoom(int id_Room) {
        return null;
    }

    @Override
    public void updateRoom(Room room) {

    }

    @Override
    public void deleteRoom(Room room) {

    }

    @Override
    public void addRoom(Room room) {

    }
}
