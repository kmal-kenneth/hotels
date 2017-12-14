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
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `room_type` (`id`, `name`, `bed_type`, `number_people`, `size`, `all_inclusive`, `description`, `terrace`, `Seaview`, `smoke`) VALUES (NULL, '");
            query.append(room_type.getName());
            query.append("', '");
            query.append(room_type.getName());
            query.append("', '");
            query.append(room_type.getBed_type());
            query.append("', '");
            query.append(room_type.getNumber_people());
            query.append("', '");
            query.append(room_type.getSize());
            query.append("', '");
            query.append((room_type.isAll_inclusive())? 1:0);
            query.append("', '");
            query.append(room_type.getDesciption());
            query.append("', '");
            query.append((room_type.isTerrace())? 1:0);
            query.append("', '");
            query.append((room_type.isSeaview())? 1:0);
            query.append("', '");
            query.append((room_type.isSmoke())? 1:0);
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
