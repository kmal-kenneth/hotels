package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoRoom_TypeInterface;
import model.Room_Type;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoRoom_Type implements DaoRoom_TypeInterface {
    @Override
    public ArrayList<Room_Type> getAllRoom_Type() {
        ArrayList<Room_Type> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM room_type";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Room_Type room_type = new Room_Type(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("bed_type"),
                        rs.getString("desciption"),
                        rs.getInt("number_people"),
                        rs.getInt("size"),
                        rs.getBoolean("all_inclusive"),
                        rs.getBoolean("terrace"),
                        rs.getBoolean("seaview"),
                        rs.getBoolean("smoke")
                );

                list.add(room_type);
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
    public Room_Type getRoom_Type(int id_Room_Type) {
        return null;
    }

    @Override
    public void updateRoom_Type(Room_Type room_type) {

    }

    @Override
    public void deleteRoom_Type(Room_Type room_type) {

    }

    @Override
    public void addRoom_Type(Room_Type room_type) {

    }
}
