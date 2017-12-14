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
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `room` (`id`, `id_season`, `id_typeRoom`, `id_hotel`, `name`, `Price`) VALUES (NULL, '");
            query.append(room.getId_season());
            query.append("', '");
            query.append(room.getId_typeRoom());
            query.append("', '");
            query.append(room.getId_hotel());
            query.append("', '");
            query.append(room.getName());
            query.append("', '");
            query.append(room.getPrice());
            query.append("')");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query.toString());

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
